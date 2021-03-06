package bank.mvc.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Bank implements Serializable{

	private static final long serialVersionUID = 100L;

	
	private int userNo;
	private String userName;
	private String userSsn;
	private String accountNo;
	private Date openDate;
	private int typeNo;
	private String typeName;
	private Date transDate;
	private String transContent;
	private int deposit;
	private int withdraw;
	private int balance;
	
	public Bank() {}

	public Bank(int userNo, String userName, String userSsn, String accountNo, Date openDate, int typeNo,
			String typeName, Date transDate, String transContent, int deposit, int withdraw, int balance) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.userSsn = userSsn;
		this.accountNo = accountNo;
		this.openDate = openDate;
		this.typeNo = typeNo;
		this.typeName = typeName;
		this.transDate = transDate;
		this.transContent = transContent;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSsn() {
		return userSsn;
	}

	public void setUserSsn(String userSsn) {
		this.userSsn = userSsn;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public int getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getTransContent() {
		return transContent;
	}

	public void setTransContent(String transContent) {
		this.transContent = transContent;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Bank [userNo=" + userNo + ", userName=" + userName + ", userSsn=" + userSsn + ", accountNo=" + accountNo
				+ ", openDate=" + openDate + ", typeNo=" + typeNo + ", typeName=" + typeName + ", transDate="
				+ transDate + ", transContent=" + transContent + ", deposit=" + deposit + ", withdraw=" + withdraw
				+ ", balance=" + balance + "]";
	}
	
	
}
