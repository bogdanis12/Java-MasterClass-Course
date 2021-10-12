package com.company;

public class VipCustomer {
     private String name;
     private double creditlimit;
     private String email;

     public VipCustomer(){
          this("Default name", 5000.00, "default@email.com");
     }

     public VipCustomer(String name, double creditlimit) {
          this(name, creditlimit, "unknown@email.com");
     }

     public VipCustomer(String name, double creditlimit, String email) {
          this.name = name;
          this.creditlimit = creditlimit;
          this.email = email;
     }

     public String getName() {
          return name;
     }

     public double getCreditlimit() {
          return creditlimit;
     }

     public String getEmail() {
          return email;
     }
}
