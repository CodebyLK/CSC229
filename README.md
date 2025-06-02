# CSC 229 Data Structures & Repository

<font size= "4">This repository contains assignments for Summer 2025 Data Structures & Algorithms.</font>  

## 1. Table of Contents
### Bank Account
&emsp;[BankAccount.java](https://github.com/CodebyLK/CSC229/blob/9b7d67d5fadff057f1fe3d2f4ab17c17af0f835c/BankAccount/BankAccount.java)   
&emsp;[SavingsAccount.java](https://github.com/CodebyLK/CSC229/blob/9b7d67d5fadff057f1fe3d2f4ab17c17af0f835c/BankAccount/SavingsAccount.java)   
&emsp;[Transactions.java](https://github.com/CodebyLK/CSC229/blob/9b7d67d5fadff057f1fe3d2f4ab17c17af0f835c/BankAccount/Transactions.java)  

## 2. Program Details

### Bank Account

#### BankAccount.java  
This is an abstract class representing a bank account that has fields to hold balance, number of deposits per month, number of withdrawals per month, annual interest rate and monthly service charges. It also contains methods for deposit, withdraw, calcInterest and monthlyProcess. The deposit method adds the deposit amount to the balance and increases the number of deposits by one. The withdraw method subtracts the deposit amount from the current balance and increases the number of withdrawals by one. The calcInterest method calculates the monthly interest and adds it to the current balance. Finally, the monthlyProcess method subtracts the monthly service charge from the balance, calls the calcInterest method and sets both the number of deposits and withdrawals to zero. A toString method prints out the monthly statement showing the Annual Interest Rate, Total Interest, Monthly Service Charge, Number of Deposits, Number of Withdrawals, and Balance.

#### SavingsAccount.java 
This is a concrete class that extends the Bank Account class. It has a status method to determine whether or not the account holds $25 or more. If the current balance is below the threshold no more withdrawals are allowed and the account becomes inactive until a deposit is made to bring the balance above $25. The deposit method checks the status of the account and, if a deposit brings the account above the threshold, will reactivate the account. The withdraw method also checks the status of the account and will not allow a withdrawal from the account in inactive status. If however, the account is in active status a withdrawal is made using a call to the superclass. The monthlyProcess method checks the number of withdrawals and adds a $1 service charge for each withdrawal exceeding four. Finally, the superclass monthlyProcess method is called.

#### Transactions.java  
This class holds the main method and demonstrates how the accounts work. A new Savings Account instance is created called trans1 with arguments for balance, interest rate and monthly service charge. Several deposit and withdrawal transactions are made to demonstrate the ability of the account to refuse transactions that will bring the account below the $25 threshold. A monthly process is performed and demonstrates the toString (monthly statement) and the additional surcharge for excessive withdrawals. Finally, a deposit is made to bring the account back to active status and another monthly process is performed showing the updated number of deposits and withdrawals and monthly service charge without the additional fee for excessive withdrawals. 

