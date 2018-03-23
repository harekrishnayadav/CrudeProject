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
}
