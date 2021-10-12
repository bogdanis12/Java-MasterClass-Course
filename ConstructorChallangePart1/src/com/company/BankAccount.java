package com.company;

public class BankAccount {
    private String accountnumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountnumberNumber(){
        return accountnumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setAccountnumber(String accountnumber){
        this.accountnumber=accountnumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void depositFunds(int deposit){
        balance = balance + deposit;
        System.out.println("You have succesfuly deposited the amount of: " + deposit + " and your balance is: " + balance);
    }
    public void withdrawalFunds(int withdrawal){
        if(balance <= withdrawal){
            System.out.println("No funds");
        }else{
            balance = balance - withdrawal;
            System.out.println("You have withdrawal this sum: " + withdrawal + " and your balance is: " + balance);
        }
    }


}
