package com.warana.account;
import java.util.Scanner;

public class MainApp 
{

    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        Endoftheday[] end=new Endoftheday[100];
        Endoftheday ref=new Endoftheday();
        int ctr=0;
        
        boolean continueProgram = true;

        while (continueProgram) 
        {
        	System.out.println("\n");
            System.out.println("----------------------------");
            System.out.println("|   Welcome to  Bank!   |");
            System.out.println("----------------------------");
            System.out.println("1. Create new account");
            System.out.println("2. Close an existing account");
            System.out.println("3. Deposit balance");
            System.out.println("4. Withdraw balance");
            System.out.println("5. Check balance");
            System.out.println("6. Generate report");
            System.out.println("7. Calculate Interest");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();   

            switch (choice) 
            {
                case 1:
                {
                	System.out.println("1. Savings Account");
                    System.out.println("2. Salary Account");
                    System.out.println("3. Current Account");
                    System.out.println("4. Loan Account");
                    System.out.print("Enter your choice: ");
                    int ch1 = scanner.nextInt();
                    scanner.nextLine(); 

                    switch(ch1)
                    {
                    case 1:
                    {
                    	
                          
                    	 System.out.println("Enter your name");
                    	 String nm=scanner.nextLine();
                    	 
                    	 System.out.println("Enter your initial balance");
                    	 double b=scanner.nextDouble();
                    	 
                         SavingAccount[] act = new SavingAccount[10];
                         SavingAccount act1=new SavingAccount();
                         
                         act1.createaccount(nm, b);
                         for (int i = 0; i < accounts.length; i++) {
                             if (accounts[i] == null) {
                                 accounts[i] = act1;
                                 end[ctr] = ref;
                                 ref.addEndOfDayObject(act1); 
                                 ctr++;
                                 break;
                                 
                             }
                         
                         }
                    	 
                    	 
                    }
                    break;
                    
                    case 2:
                    {
                    	System.out.println("Enter your name");
                   	 String nm=scanner.nextLine();
                   	 
                   	 System.out.println("Enter your initial balance");
                   	 double b=scanner.nextDouble();
                   	 
                   	SalaryAccount[] act = new SalaryAccount[10];
                   	SalaryAccount act1=new SalaryAccount();
                        
                        act1.createaccount(nm, b);
                        for (int i = 0; i < accounts.length; i++) {
                            if (accounts[i] == null) {
                                accounts[i] = act1; 
                                end[ctr] = ref;
                                ref.addEndOfDayObject(act1); 
                                ctr++;
                                break;
                            }
                        
                        }
                    	
                    }
                    break;
                    
                    case 3:
                    {
                    	System.out.println("Enter your name");
                   	 String nm=scanner.nextLine();
                   	 
                   	 System.out.println("Enter your initial balance");
                   	 double b=scanner.nextDouble();
                   	 
                   	CurrentAccount[] act = new CurrentAccount[10];
                   	CurrentAccount act1=new CurrentAccount();
                        
                     act1.createaccount(nm, b);
                     for (int i = 0; i < accounts.length; i++)
                     {
                         if (accounts[i] == null)
                         {
                             accounts[i] = act1; 
                             end[ctr] = ref;
                             ref.addEndOfDayObject(act1); 
                             ctr++;
                             break;
                         }
                     
                     }
                        
                    }
                    break;
                    
                    case 4:
                    {
                    	System.out.println("Enter your name");
                   	 String nm=scanner.nextLine();
                   	 
                   	 System.out.println("Enter your initial balance");
                   	 double b=scanner.nextDouble();
                   	 
                   	LoanAccount[] act = new LoanAccount[10];
                   	LoanAccount act1=new LoanAccount();
                        
                     act1.createaccount(nm, b);
                     for (int i = 0; i < accounts.length; i++) 
                     {
                         if (accounts[i] == null)
                         {
                             accounts[i] = act1;
                             end[ctr] = ref;
                             ref.addEndOfDayObject(act1); 
                             ctr++;
                             break;
                         }
                     
                     }
                        
                    }
                    break;
                    
                    }
                    break;
                    
                  }
                case 2:
                {
                	System.out.println("Enter the account number to close: ");
                    int accountNumber = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < accounts.length; i++) 
                    {
                        if (accounts[i] != null && accounts[i].getActId() == accountNumber) //strcmp
                        {
                            
                            accounts[i].deleteaccount();
                            accounts[i] = null;
                            
                            found = true;
                            System.out.println("Account closed successfully.");
                            break;
                        }
                    }
                    
                    if (!found) 
                    {
                        System.out.println("Account not found or already closed.");
                    }
                    break;
                	
                	
                	
                }
                
                case 3: 
                {
                    System.out.println("Enter the account number to deposit into: ");
                    int accountNumber = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < accounts.length; i++) 
                    {
                        if (accounts[i] != null && accounts[i].getActId() == accountNumber) 
                        {
                            System.out.println("Enter the amount to deposit: ");
                            double amount = scanner.nextDouble();
                            scanner.nextLine(); 
                            
                            
                            ctr++;
                            
                            accounts[i].deposit(amount);
                            
                            found = true;
                            System.out.println("Deposit successful.");
                            break;
                        }
                    }
                    
                    if (!found) 
                    {
                        System.out.println("Account not found.");
                    }
                    break;
                }
                
                case 4: 
                {
                    System.out.println("Enter the account number to withdraw from: ");
                    int accountNumber = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < accounts.length; i++) 
                    {
                        if (accounts[i] != null && accounts[i].getActId() == accountNumber)
                        {
                            System.out.println("Enter the amount to withdraw: ");
                            double amount = scanner.nextDouble();
                            scanner.nextLine(); 
                            
                            
                            double withdrawnAmount = accounts[i].withdraw(amount);
                            if (withdrawnAmount > 0) 
                            {
                                found = true;
                                System.out.println("Withdrawal successful. Amount withdrawn: " + withdrawnAmount);
                            }
                            else 
                            {
                                System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
                            }
                            break;
                        }
                    }
                    
                    if (!found) 
                    {
                        System.out.println("Account not found.");
                    }
                    break;
                }
                
                case 5:
                {
                
                    System.out.println("Enter the account number : ");
                    int accountNumber = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < accounts.length; i++) 
                    {
                        if (accounts[i] != null && accounts[i].getActId() == accountNumber) 
                        {
                            
                            scanner.nextLine(); 
                       
                            System.out.println("Account ID: " + accounts[i].getActId());
                            System.out.println("Account Holder Name: " + accounts[i].getAccountHolderName());
                            System.out.println("Balance: " +accounts[i].getBalance() );
                            found =true;
                            
                            
                        }
                    }
                            
                    if (!found) 
                    {
                        System.out.println("Account not found.");
                    }
                    break;
                }
                
                case 6:
                {
                	Endoftheday eof=new Endoftheday();
                	eof.display();                	

                break;	
                }
                
                case 7:
                {
                	for (int i = 0; i < accounts.length; i++) 
                	{
                        if (accounts[i] instanceof SavingAccount) 
                        {
                            SavingAccount savingAccount = (SavingAccount) accounts[i];
                            double interest = savingAccount.calculateInterest();
                            System.out.println("Interest for Savings Account " + savingAccount.getActId() + ": " + interest);
                        } 
                        else if (accounts[i] instanceof LoanAccount) 
                        {
                            LoanAccount loanAccount = (LoanAccount) accounts[i];
                            double interest = loanAccount.calculateInterest();
                            System.out.println("Interest for Loan Account " + loanAccount.getActId() + ": " + interest);
                        }
                        else if (accounts[i] instanceof CurrentAccount) 
                        {
                        	CurrentAccount currentAccount= (CurrentAccount) accounts[i];
                            double interest = currentAccount.calculateInterest();
                            System.out.println("Interest for Loan Account " + currentAccount.getActId() + ": " + interest);
                        }
                        else if (accounts[i] instanceof SalaryAccount) 
                        {
                        	SalaryAccount salaryAccount = (SalaryAccount) accounts[i];
                            double interest = salaryAccount.calculateInterest();
                            System.out.println("Interest for Loan Account " + salaryAccount.getActId() + ": " + interest);
                        }
                        
                    }
                    break;
                	
                }
                
                case 8:
                	System.out.println("EXIT");
                	continueProgram=false;
                    break;

               }
           }
        }
            
        
}