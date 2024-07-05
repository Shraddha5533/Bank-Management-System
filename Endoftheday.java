package com.warana.account;

public class Endoftheday 
{
     int actId;
     String actHolderName;
     double amount;
     String activity;
    
     public Endoftheday() 
     {
    	 endOfDayAccounts = new Account[100]; // Initialize the array with size 100
         numberOfAccounts = 0;
	}
     
     public  Endoftheday(int actId, String actHolderName, double amount, String activity) {
		super();
		this.actId = actId;
		this.actHolderName = actHolderName;
		this.amount = amount;
		this.activity = activity;
	}
     
     public int getActId() 
     {
		return actId;
	}

	public void setActId(int actId)
	{
		this.actId = actId;
	}

	public String getActHolderName() 
	{
		return actHolderName;
	}

	public void setActHolderName(String actHolderName) 
	{
		this.actHolderName = actHolderName;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}

	public String getActivity() 
	{
		return activity;
	}

	public void setActivity(String activity) 
	{
		this.activity = activity;
	}
	
	private Account[] endOfDayAccounts; 
    private int numberOfAccounts; 
    

    public void addEndOfDayObject(Account account) 
    {
        if (numberOfAccounts < endOfDayAccounts.length) 
        { 
        	endOfDayAccounts[numberOfAccounts] = account; 
            numberOfAccounts++; 
            System.out.println("Account added to end of day records.");
        }
        else
        {
            System.out.println("Cannot add account. End of day records full.");
        }
    }

    

	public void display() 
	{
        System.out.println("Account Number: " + actId);
        System.out.println("Account Holder Name: " + actHolderName );
        System.out.println("Amount: " + amount);
        System.out.println("Activity: " + activity);
        System.out.println("-----------------------------------------");
    }
	

}