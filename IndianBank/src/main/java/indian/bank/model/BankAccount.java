package indian.bank.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Bank_Accounts")
public class BankAccount extends ModelBase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "Account_Name", nullable = false, length = 255, unique = true)
	private String accountName;
	@Column(name = "Balance", nullable = false)
	private Long balance;
	@Column(name = "Last_Transaction_Date", nullable = false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date lastTransactionDate;
	@Column(name = "Start_Date", nullable = false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date startDate = new Date();
	@Column(name = "End_Date", nullable = false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date endDate;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "onwerAccountDeposit")
	private Set<AccountDeposit> onwedAccountDeposits;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "onwerAccountWithrawal")
	private Set<AccontWithdrawal> ownedAccountWithrawals;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<AccountDeposit> getOnwedAccountDeposits() {
		return onwedAccountDeposits;
	}

	public void setOnwedAccountDeposits(Set<AccountDeposit> onwedAccountDeposits) {
		this.onwedAccountDeposits = onwedAccountDeposits;
	}

	public Set<AccontWithdrawal> getOwnedAccountWithrawals() {
		return ownedAccountWithrawals;
	}

	public void setOwnedAccountWithrawals(Set<AccontWithdrawal> ownedAccountWithrawals) {
		this.ownedAccountWithrawals = ownedAccountWithrawals;
	}

	public String toString() {
		return String.format("AC/%d-%s", id, accountName);

	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof BankAccount) {
			return this.hashCode() == ((BankAccount) obj).hashCode();
		} else {

		}
		return false;
	}

	public int hashCode() {
		return this.id.hashCode();

	}
}
