/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.model;

import java.util.Date;

/**
 *
 * @author chris_xtx7ln9
 */
public class Transaction {
    
    private int transactionID;
    private Date transactionDate;
    private int transactionFrom;
    private int transactionTo;
    private long amount;
    private String message;

    public Transaction() {
    }

    public Transaction(int transactionID, Date transactionDate, int transactionFrom, int transactionTo, long amount, String message) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionFrom = transactionFrom;
        this.transactionTo = transactionTo;
        this.amount = amount;
        this.message = message;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getTransactionFrom() {
        return transactionFrom;
    }

    public void setTransactionFrom(int transactionFrom) {
        this.transactionFrom = transactionFrom;
    }

    public int getTransactionTo() {
        return transactionTo;
    }

    public void setTransactionTo(int transactionTo) {
        this.transactionTo = transactionTo;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }  
}
