
package java_class;

public class BankingSystem {
          private String accountNumber;
          private String accountName;
          private double balance;
          //parametrize constructor
          BankingSystem(String accountNumber,String accountName){
        	  this.accountNumber=accountNumber;
        	  this.accountName=accountName;
        	  this.balance=0;
          }
          
          //getter
          public String getAccountNumber() {
        	  return accountNumber;
        	  
          }
          
          public String getAccountName() {
        	  return accountName;
        	  
          }
          
          public double getBalance() {
        	  return balance;
        	  
          }
          
       // Deposit method
          public void deposit(double amount) {
              if (amount > 0) {
                  balance += amount;
                  System.out.println("Deposited: " + amount);
              } else {
                  System.out.println("Deposit amount must be positive.");
              }
          }
          
          public void withdraw(double amount) {
              if (amount > 0 && amount <= balance) {
                  balance -= amount;
                  System.out.println("Withdrawn: " + amount);
              } else if (amount > balance) {
                  System.out.println("Insufficient balance.");
              } else {
                  System.out.println("Withdrawal amount must be positive.");
              }
          }
      }
          
          
//          //Setter syntax
//          public void setAccountNumber(String accountNumber) {
//        	  this.accountNumber=accountNumber;
//          }

