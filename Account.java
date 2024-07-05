package com.warana.account;


// Account class ,Saving account and Design done by Shraddha Gajanan Patil.
//Loan account and main  done by Nikita Tonge.
//Salary account and current account done by Kshitija shitole.
public abstract class Account 
{
	int actId;
	String accountHolderName;
	double balance;
	double amount;
	
	public Account() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(int actId, String accountHolderName, double balance, double amount) 
	{
		
		this.actId = actId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.amount = amount;
	}
	
	
public int getActId() 
	{
		return actId;
	}


	public void setActId(int actId) 
	{
		this.actId = actId;
	}


	public String getAccountHolderName() 
	{
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() 
	
	{
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAmount() 
	{
		return amount;
	}


	public void setAmount(double amount) 
	{
		this.amount = amount;
	}


	public abstract double withdraw(double amount);
	
	public abstract double deposit(double amount);
	
	public abstract void createaccount(String accountHolderName,double balance);
	
	public abstract void deleteaccount();
	
	
	
	public abstract void display();
	
	
	
	
	
	
	

}
