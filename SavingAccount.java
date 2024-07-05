package com.warana.account;

import java.util.Scanner;

public class SavingAccount extends Account 
{
	 Scanner sc = new Scanner(System.in);
	
	static double min_Balance;
    static double roi;
    int scount=100;
    
    static
    {
    	min_Balance=10000;
    	roi=2.5;
    }
    
    
    public SavingAccount() 
    {
        // TODO Auto-generated constructor stub
    }
    
    public SavingAccount(int actId,String accountHolderName,double balance,double amount) 
    {
    	super(actId,accountHolderName,balance,amount);
       
    }
    
    
    public double withdraw(double amount) 
	{
    	
    	
		if (min_Balance > 10000) 
        {
            System.out.println("You can withdraw money");

            

            if (amount >= balance) 
            {
                System.out.println("Insufficient Balance");
            } 
            else 
            {
                balance=balance-amount;
                System.out.println("Withdraw Successfully");
            }
        } 
        else 
        {
            System.out.println("Mandatory minimum balance should be 10000");
        }
        return balance;
		
		
	}

 

	
	public double deposit(double amount) 
	{
		
		

        if(amount>0)
        {
        	balance=balance+amount;
        	System.out.println("Deposit successfull.New balance" +balance);
        	
        }
        else
        {
        	System.out.println("Invalid amount .Please enter valid amount");
        	
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
        System.out.println("Minimum Balance: " + min_Balance);
        System.out.println("Rate of Interest: " + interestrate);
    }


	public void createaccount(String accountHoldername,double Balance) 
	{
	
		
		scount++;
		actId=scount;
		accountHolderName=accountHoldername;
		balance=Balance;
		System.out.println("Your account number is:" +actId);
		System.out.println("Account Holder name is:" +accountHolderName);
		
		System.out.println("Your balance is:"+ balance);
		
		
		System.out.println("Saving account created successfully");
		
		
	}

	
	public void deleteaccount() 
	{
		if (balance == 0) 
		{
	        System.out.println("Closing savings account...");
	        this.actId = 0;
	        this.accountHolderName = " ";
	        System.out.println("Savings account closed successfully!");
	    } 
		else 
		{
	        System.out.println("Cannot close account. Withdraw all funds first.");
	    }
		
		
	}
}

	
	

