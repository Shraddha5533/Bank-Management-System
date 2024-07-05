package com.warana.account;
import java.util.Date;
import java.util.Scanner;

public class LoanAccount extends Account 
{
     double loanAmount;
    Date loanDate;
    static double roi;
    
    int lcount=300;
     
    static 
    {
        roi = 3.0;
    }

    Scanner sc = new Scanner(System.in);

    public LoanAccount()
    {
        // Default constructor
    }

    public LoanAccount(double loanAmount, Date loanDate) 
    {
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    public double getLoanAmount() 
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) 
    {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() 
    {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) 
    {
        this.loanDate = loanDate;
    }

    public double withdraw(double amount) 
    {
        
        if (amount > 0 && amount <= loanAmount) 
        {
            loanAmount -= amount;
            System.out.println("Withdrawal successful. Remaining Loan Amount: " + loanAmount);
            return amount;
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient loan funds.");
            return 0;
        }
    }

    public double deposit(double amount)
    {
        
        if (amount > 0) 
        {
            loanAmount += amount;
            System.out.println("Deposit successful. Updated Loan Amount: " + loanAmount);
            return amount;
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
            return 0;
        }
    }

    public double calculateInterest() 
    {
        double interestRate = loanAmount * roi / 100;
        return interestRate;
    }

    public void display() 
    
    {
        System.out.println("Loan Account ID: " + getActId());
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Loan Date: " + loanDate);
        System.out.println("ROI: " + roi);
    }

	
	public void createaccount(String accountHoldername, double Balance) 
	{
         
		
		lcount++;
		actId=lcount;
		accountHolderName=accountHoldername;
		loanAmount=Balance;
		
		System.out.println("Your account number is:" +actId);
		System.out.println("Account Holder name is:" +accountHolderName);
		
		System.out.println("Loan amount id" +loanAmount);
		
		
		System.out.println("Loan account created successfully");	
		
	}

	
	public void deleteaccount() 
	{
		if (balance == 0) 
		{
	        System.out.println("Closing loan account...");
	        this.actId = 0;
	        this.accountHolderName = " ";
	        System.out.println("Loan account closed successfully!");
	    } 
		else 
		{
	        System.out.println("Cannot close account. Withdraw all funds first.");
	    }
		
	}
}

