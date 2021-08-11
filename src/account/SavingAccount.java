package account;

import java.util.Date;

public class SavingAccount{
private float balance;
private String ownerName;
private Date createDate;
private String Status;
private String type;
public SavingAccount(float balance, String ownerName, Date createDate, String status, String type) {
	super();
	this.balance = balance;
	this.ownerName = ownerName;
	this.createDate = createDate;
	Status = status;
	this.type = type;
}
public float getBalance() {
	return balance;
}

public String getOwnerName() {
	return ownerName;
}

public Date getCreateDate() {
	return createDate;
}

public String getStatus() {
	return Status;
}

public String getType() {
	return type;
}



}
