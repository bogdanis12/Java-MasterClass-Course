package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountnumber("1284733");
        bankAccount.setBalance(9000.0);
        bankAccount.setCustomerName("Mihai");
        bankAccount.setEmail("mihai@gmail.com");
        bankAccount.setPhoneNumber("0745512347");
        System.out.println("Accout number: " + bankAccount.getAccountnumberNumber());
        System.out.println("balance: " + bankAccount.getBalance());
        System.out.println("Customer name: " + bankAccount.getCustomerName());
        System.out.println("Enmail: " + bankAccount.getEmail());
        System.out.println("Phone number: " + bankAccount.getPhoneNumber());
        bankAccount.depositFunds(1000);
        bankAccount.withdrawalFunds(11000);
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());
        VipCustomer person3 = new VipCustomer("bob", 230302.00, "bob@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}
