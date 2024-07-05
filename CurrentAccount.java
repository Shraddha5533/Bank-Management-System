package com.warana.account;
import java.util.Scanner;

public  class CurrentAccount extends Account
{

	double overdraft;
	 static double roi;
	 int ccount=200;
	    
	    static
	    {
	    	
	    	roi=2.0;
	    }
	
	Scanner sc=new Scanner(System.in);
	
	public CurrentAccount() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public CurrentAccount(int actId,String accountHolderName,double balance,double amount,double overdraft) 
	{
		super(actId,accountHolderName,balance,amount);
		this.overdraft = overdraft;
	}
	


	public double getOverdraft() 
	{
		return overdraft;
	}


	public void setOverdraft(double overdraft) 
	{
		this.overdraft = overdraft;
	}

	public double withdraw(double amount) 
	{
		
		
		if(amount<= balance+ overdraft) 
		{
			balance=balance-amount;
			System.out.println("Withdraw Successfully");
			
		}
		else
		{
			System.out.println("Insufficient funds.Overdraft limit exceeded");
		}
		return balance;
		
	}
	
	public double deposit(double amount) 
	{
		
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Deposit successfully");
		}
		else
		{
			System.out.println("Invalid deposit amount");
		}
		return balance;
		
		
		
	}
	
	double interestrate;
	public double calculateInterest()
	{
		 interestrate=balance*roi/100;
		return interestrate;
	}

	
	public void display() 
	{
		System.out.println("Account ID: " + actId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + interestrate);
		
		
	}


	
	public void createaccount( String accountHoldername, double Balance)
	{
		
		actId=ccount;
		accountHolderName=accountHoldername;
		balance=Balance;
		
		ccount++;
		actId=ccount;
		System.out.println("Your account number is:" +actId);
		System.out.println("Account Holder name is:" +accountHolderName);
		System.out.println("Your balance is:"+ balance);
		
		
		System.out.println("Current account created successfully");
		
		
	}


	
	public void deleteaccount()
	{
		if (balance == 0) 
		{
	        System.out.println("Closing current account...");
	        this.actId = 0;
	        this.accountHolderName = " ";
	        System.out.println("Current account closed successfully!");
	    } 
		else 
		{
	        System.out.println("Cannot close account. Withdraw all funds first.");
	    }
		
	}



	
}
