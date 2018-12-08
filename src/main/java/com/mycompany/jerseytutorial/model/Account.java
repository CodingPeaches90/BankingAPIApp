/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jordan May
 * 
 */

@XmlRootElement
public class Account {
    
    /**
    * Account variables
    */
    private int accountNo;
    private int customerID;
    private String accountType;
    private float balance;

    /**
    * Constructor
    */
    public Account() {
    }

    /**
    * Constructor
    */
    public Account(int accountNo, int customerID, String accountType, float balance) {
        this.accountNo = accountNo;
        this.customerID = customerID;
        this.accountType = accountType;
        this.balance = balance;
    }

    /**
    * Getters and setters
    */
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }   
}