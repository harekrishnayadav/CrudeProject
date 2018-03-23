package indian.bank.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
//Created by HKY 23/3/2018
@MappedSuperclass
public class ModelBase {
	@Column(name = "Created_By", nullable = false)
	private String createdBy = "User1";
	@Column(name = "LastEditBy", nullable = false)
	private String LastEditBy;
	@Column(name = "Created_Date", nullable = true)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date createdDate = new Date();
	@Column(name = "Last_Edit_Date", nullable = false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date lastEditedDate = new Date();
	@Column(name = "Entry_Id", nullable = true, unique = true)
	private String entryId = UUID.randomUUID().toString();

	public ModelBase() {
		super();
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastEditBy() {
		return LastEditBy;
	}

	public void setLastEditBy(String lastEditBy) {
		LastEditBy = lastEditBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastEditedDate() {
		return lastEditedDate;
	}

	public void setLastEditedDate(Date lastEditedDate) {
		this.lastEditedDate = lastEditedDate;
	}

	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	@Override
	public String toString() {
		return "ModelBase [createdBy=" + createdBy + ", LastEditBy=" + LastEditBy + ", createdDate=" + createdDate
				+ ", lastEditedDate=" + lastEditedDate + ", entryId=" + entryId + "]";
	}

}
