package com.company;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String firstName;
    private String lastName;
    private double balance = 0;
    private String email;
    private String phoneNumber;
    private double lastTransaction;

    public BankAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        this.accountNumber = scanner.next();
        System.out.println("Enter your First Name: ");
        this.firstName = scanner.next();
        System.out.println("Enter your First Name: ");
        this.lastName = scanner.next();
        System.out.println("Enter your email: ");
        this.email = scanner.next();
        System.out.println("Enter your phone number: ");
        this.phoneNumber = scanner.next();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public  void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPress ");
        System.out.println("\t 1 - To show balance");
        System.out.println("\t 2 - To withdraw money and show current balance.");
        System.out.println("\t 3 - To add money into back account.");
        System.out.println("\t 4 - Check user details");
        System.out.println("\t 5 - Interest rate.");
        System.out.println("\t 6 - Last Transaction");
        System.out.println("\t 7 - Show menu again");
        System.out.println("\t 8 - Quit");
        boolean quit = true;
        do{
            System.out.println();
            int option = scanner.nextInt();
            System.out.println();

            switch (option){
                case 1:
                    System.out.println("Your balance is: " + getBalance());
                    System.out.println("====================");
                    break;
                case 2:
                    withdraw();
                    System.out.println("Your new balance after withdrawal is: " + balance);
                    System.out.println("====================");
                    break;
                case 3:
                    addMoney();
                    System.out.println("Your deposit is " + balance);
                    System.out.println("====================");
                    break;
                case 4:
                    System.out.println("User details are: " + userDetail());
                    System.out.println("====================");
                    break;
                case 5:
                    interestRate();
                    break;
                case 6:
                    getLastTransaction();
                    break;
                case 7:
                    System.out.println("\nPress ");
                    System.out.println("\t 1 - To show balance");
                    System.out.println("\t 2 - To withdraw money and show current balance.");
                    System.out.println("\t 3 - To add money into back account.");
                    System.out.println("\t 4 - Check user details");
                    System.out.println("\t 5 - Interest rate.");
                    System.out.println("\t 6 - Last Transaction");
                    System.out.println("\t 7 - Show menu again");
                    System.out.println("\t 8 - Quit application");
                    break;
                case 8:
                    quit=false;
                    break;
            }
        }while (quit);

    }

    public void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you would like to withdraw: ");
        double moneyToWithdraw = scanner.nextDouble();
        lastTransaction = -moneyToWithdraw;
        if(moneyToWithdraw>balance){
            System.out.println("Insufficient funds");
        }
        else{
            balance = balance-moneyToWithdraw;
            System.out.println("Last transaction was: " + lastTransaction + " debited from your card.");
        }

    }

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount that you would like to deposit: ");
        double moneyToAdd = scanner.nextDouble();
        lastTransaction = moneyToAdd;
        balance = balance+moneyToAdd;
        System.out.println("Your last transaction was: " + lastTransaction + " added to your card");
    }

    public String userDetail(){
        return (this.firstName + "  " + this.lastName + ",  " + this.accountNumber + ", " + balance + ", " + this.email + ", " + this.phoneNumber);
    }

    public void interestRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers that you are interested to deposit: " );
        int years = scanner.nextInt();
        if (years<0) {
            System.out.println("You can not enter negative numbers");
        }
        else{
            System.out.println("Choose your rate per year(ex: 3% = 0,03): ");
            double rate = scanner.nextDouble();
            double actualBalance = balance*(1 + (years*rate));
            System.out.println("You will have in 5 years: " + actualBalance + " that means: " + (actualBalance-balance) + " profit");
        }
    }

    public void getLastTransaction(){
        if(lastTransaction < 0){
            System.out.println("Your last withdrawal was: " + lastTransaction);
        }
        else if( lastTransaction>0){
            System.out.println("Your last deposit was: " + lastTransaction);
        }
        else{
            System.out.println("No transaction was found");
        }
    }


}
