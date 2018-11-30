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
    
    public List<Transaction> getAllTransactions(){
        return db.getTransactionTB();
    }
    
    public ArrayList<Transaction> getTransactionsByAcc(int accNo){
        ArrayList <Transaction> statement =  new ArrayList<>();
        
        for (Transaction t: db.getTransactionTB()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getTransactionTo() == (accNo))){
               statement.add(t);
            }
        }
        return statement;
    }
    
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
    public Transaction addTransaction(Transaction ac)
    {
        ac.setTransactionID(db.getTransactionTB().size() + 1);
        db.addTransaction(ac);
        return ac;
    }
}