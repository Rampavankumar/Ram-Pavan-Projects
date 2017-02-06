package operations;

public class Account {
	
	
	
	private int id;
	
	private String lastname;
	private String firstname;
	private int balance;
	
	
private Account(){
	
}

public Account(int id,String lastname,String firstname,int balance){
	
	this.id=id;
	this.lastname=lastname;
	this.firstname=firstname;
	this.balance=balance;
	
	
	
	
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}


	
}