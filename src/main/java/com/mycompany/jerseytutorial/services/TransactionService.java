/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.database.Database;
import com.mycompany.jerseytutorial.model.Transaction;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christopher Kambayi
 */
public class TransactionService {
    
    /*database object  */
    Database db = new Database();
    
    public TransactionService() {
    
    } 
    /* Get ALL transactions in system*/
    public List<Transaction> getAllTransactions(){
        return db.getTransactionTB();
    }
    
    /* Get transactions by account number */
    public ArrayList<Transaction> getTransactionsByAcc(int accNo){
        ArrayList <Transaction> statement =  new ArrayList<>();
        
        for (Transaction t: db.getTransactionTB()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getTransactionTo() == (accNo))){
               statement.add(t);
            }
        }
        return statement;
    }
    
    /* Get set up Direct Debits by account number */
    public ArrayList<Transaction> getDirectDebit(int accNo){
        ArrayList <Transaction> directDebits =  new ArrayList<>();
        
        for (Transaction t: db.getTransactionTB()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getType().equals("Direct Debit"))){
               directDebits.add(t);
            }
        }
        return directDebits;
    }
    
    /* Get set up Direct Debits by account number */
    public ArrayList<Transaction> getMobileTopUp(int accNo){
        ArrayList <Transaction> topup =  new ArrayList<>();
        
        for (Transaction t: db.getTransactionTB()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getType().equals("Mobile TopUp"))){
               topup.add(t);
            }
        }
        return topup;
    }
    
    /* Get transactions by account number and month*/
    public ArrayList<Transaction> getTransactionsByAcc(int accNo, int month){
        ArrayList <Transaction> statement =  new ArrayList<>();
        
        for (Transaction t: db.getTransactionTB()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getTransactionTo() == (accNo))){
                
                Date td = t.getTransactionDate();
                LocalDate ldtd = td.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int m = ldtd.getMonthValue();
                
                if(m == month){
                    statement.add(t);
                }
            }
        }
        return statement;
    }
    
    /* Create Transaction */
    public boolean addTransaction(Transaction ac){
        
        return db.addTransaction(ac);
    }
    
    /* Create Direct Debit */
    public boolean addDirectDebit(Transaction dd){
        dd.setType("Direct Debit");
        return db.addTransaction(dd);
    }
    
    /* Create Mobile Top Up */
    public boolean addMobileTopUp(Transaction tt){
        tt.setType("Mobile TopUp");
        return db.addTransaction(tt);
    }
}