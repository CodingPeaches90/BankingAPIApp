/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.database;

import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.model.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christopher Kambayi
 * @author Jordan May
 * 
 */

public class Database {
    
/**
* Mock database made up of ArrayLists
*/
    private static List<Customer> customerTB = new ArrayList<>(); 
    private static List<Account> accountTB = new ArrayList<>(); 
    private static List<Transaction> transactionTB = new ArrayList<>(); 
    
    public static boolean init = true;

    /**
    * Constructor for database with mock data in Arraylists
    */
    public Database() {
        if(init){
            Customer c1 = new Customer("Jordan", "May", "BollyWood", "w234", "1234" , 1);
            Customer c2 = new Customer("Christopher", "Kambayi", "Santry", "e344", "342" , 2);

            customerTB.add(c1);
            customerTB.add(c2);

            Account a1 = new Account(123, 321, "Current", (float)43000);
            Account a2 = new Account(124, 322, "Current", (float)45000);
            Account a3 = new Account(125, 323, "Savings", (float)155000);
            Account a4 = new Account(183, 921, "Savings", (float)4000);
            Account a5 = new Account(126, 521, "Loan", (float)-4000);
            Account a6 = new Account(627, 221, "Loan", (float)-254954);

            accountTB.add(a1);
            accountTB.add(a2);
            accountTB.add(a3);
            accountTB.add(a4);
            accountTB.add(a5);
            accountTB.add(a6);

            Transaction t1 = new Transaction(01, new Date(2018,11,1), 123, 627, (long)444.12, "Pizza");
            Transaction t2 = new Transaction(01, new Date(2018,11,2), 124, 126, (long)4414.09, "Save");
            Transaction t3 = new Transaction(03, new Date(2018,11,13), 125, 183, (long)1444.24, "Thanks");
            Transaction t4 = new Transaction(04, new Date(2018,11,4), 183, 125, (long)34.34, "Merci");
            Transaction t5 = new Transaction(05, new Date(2018,11,15), 126, 124, (long)544.74, "Lol");
            Transaction t6 = new Transaction(06, new Date(2018,11,6), 627, 123, (long)474.04, "Pimp");
            Transaction t7 = new Transaction(07, new Date(2018,11,6), 123, 125, (long)11444.02, "Money");
            Transaction t8 = new Transaction(8, new Date(2018,11,7), 124, 123, (long)5444.3, "Piggy bank");
            Transaction t9 = new Transaction(9, new Date(2018,11,11), 125, 627, (long)7444.5, "I owe u");
            Transaction t10 = new Transaction(10, new Date(2018,11,8), 183, 126, (long)54.6, "Money");
            Transaction t11 = new Transaction(11, new Date(2018,11,9), 126, 183, (long)4144.7, "Money");
            Transaction t12 = new Transaction(12, new Date(2018,11,9), 627, 124, (long)4044.9, "Money");

            transactionTB.add(t1);
            transactionTB.add(t2);
            transactionTB.add(t3);
            transactionTB.add(t4);
            transactionTB.add(t5);
            transactionTB.add(t6);
            transactionTB.add(t7);
            transactionTB.add(t8);
            transactionTB.add(t9);
            transactionTB.add(t10);
            transactionTB.add(t11);
            transactionTB.add(t12);
            
            init = false;
        }
    }

    /**
    * Getters
    */
    public static List<Customer> getCustomerTB() {
        return customerTB;
    }

    public static List<Account> getAccountTB() {
        return accountTB;
    }

    public static List<Transaction> getTransactionTB() {
        return transactionTB;
    }
    
    /**
    * Method to add Customer to Customer Database
    */
    public static boolean addCustomer(Customer c){
        int before = customerTB.size();
        c.setCustomerUID(customerTB.size() + 1);
        customerTB.add(c);
        System.out.println("Size= " + customerTB.size());
        int after = customerTB.size();
        
        if(after > before){
            return true;
        }
        else{
          return false;  
        }
    }
    
    /**
    * Method to add Account to Account Database
    */
    public static boolean addAccount(Account a){
        int before = accountTB.size();
        accountTB.add(a);
        System.out.println("Size= " + accountTB.size());
        int after = customerTB.size();
        
        if(after > before){
            return true;
        }
        else{
          return false;  
        }
    }
    
    /**
    * Method to add Transaction to Transaction Database
    */
    public static boolean addTransaction(Transaction t){
        int before = transactionTB.size();
        t.setTransactionID(transactionTB.size() + 1);
        transactionTB.add(t);
        System.out.println("Size= " + transactionTB.size());
        int after = customerTB.size();
        
        if(after > before){
            return true;
        }
        else{
          return false;  
        }
    }
    
    /**
    * Update Customer details on DB
    */
    public static boolean updateCustomer(Customer t){
        int index = 0;
        for(Customer tempc : customerTB){  
            if(t.getCustomerUID() == tempc.getCustomerUID()){
                customerTB.remove(index);
                customerTB.add(t);
                System.out.println("Size= " + customerTB.size());
                return true;
            }
            index++;
        }
        return false;
    }
    
    /**
    * Delete Customer from DB
    */
    public static boolean deleteCustomer(Customer t){
        int index = 0;
        for(Customer tempc : customerTB){  
            if(t.getCustomerUID() == tempc.getCustomerUID()){
                customerTB.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }
    
    /**
    * Delete Account from DB
    */
    public static boolean deleteAccount(Account a){
        int index = 0;
        for(Account tempa : accountTB){  
            if(a.getAccountNo() == tempa.getAccountNo()){
                accountTB.remove(index);
                return true;
            }
            index++;
        }
        return false;
    }
}