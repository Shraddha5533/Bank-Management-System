package com.warana.account;

import java.util.Scanner;


public class SalaryAccount extends SavingAccount
{
	static int max_Inactive_Months=2;
	int inactiveMonths;
	static double roi;
	
	Scanner sc = new Scanner(System.in);
	static
    {
    	
    	roi=2.5;
    }
	public SalaryAccount(int actId,String accountHolderName,double balance,double amount,int inactiveMonths) 
    {
    	super(actId,accountHolderName,balance,amount);
    	this.inactiveMonths=inactiveMonths;
    	
       
    }
    
	
	
	public SalaryAccount() 
	{
		// TODO Auto-generated constructor stub
	}

	
	
	
	public SalaryAccount(int inactiveMonths) 
	{
		
		this.inactiveMonths = inactiveMonths;
	}

	public int getInactiveMonths() 
	{
		return inactiveMonths;
	}

	public void setInactiveMonths(int inactiveMonths) 
	{
		this.inactiveMonths = inactiveMonths;
	}
	
	 public double withdraw(double amount)
	 {
		 
		 
	            if (amount > 0 && amount <= balance) 
	            {
	                balance =balance- amount;
	                System.out.println("Withdrawal successful");
	            } 
	            else 
	            {
	                System.out.println("Invalid withdrawal amount or insufficient funds");
	            }
	        
		
	        

	        return balance;
	    } 
	public double deposit(double amount)
		{
		
		
		if (inactiveMonths <= max_Inactive_Months) 
		 {
			if (amount > 0) 
			{
		        balance =balance+ amount;
		        System.out.println("Deposit successful");
		    } 
			else 
			{
		        System.out.println("Invalid deposit amount");
		    }
		 }
		else
		{
            System.out.println("Account is inactive for too long. Cannot withdraw.");
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
        System.out.println("Inactive Months:" +inactiveMonths);
        System.out.println("Rate of Interest: " +interestrate );
	}
}
