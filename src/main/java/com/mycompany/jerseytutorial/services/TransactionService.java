/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Transaction;
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
    
    private List<Transaction> transactionDB = new ArrayList<>();
    public static boolean init = true;
    
    public TransactionService() {
     if (init) {
         
        Transaction t1 = new Transaction(01, new Date(18/11/1), 123, 627, (long)444.4, "Pizza");
        Transaction t2 = new Transaction(01, new Date(18/11/2), 124, 126, (long)444.4, "Save");
        Transaction t3 = new Transaction(03, new Date(18/11/13), 125, 183, (long)444.4, "Thanks");
        Transaction t4 = new Transaction(04, new Date(18/11/4), 183, 125, (long)444.4, "Merci");
        Transaction t5 = new Transaction(05, new Date(18/11/15), 126, 124, (long)444.4, "Lol");
        Transaction t6 = new Transaction(06, new Date(18/11/6), 627, 123, (long)444.4, "Pimp");
        
        Transaction t7 = new Transaction(07, new Date(18/11/6), 123, 125, (long)444.4, "Money");
        Transaction t8 = new Transaction(8, new Date(18/11/7), 124, 123, (long)444.4, "Piggy bank");
        Transaction t9 = new Transaction(9, new Date(18/11/11), 125, 627, (long)444.4, "I owe u");
        Transaction t10 = new Transaction(10, new Date(18/11/8), 183, 126, (long)444.4, "Money");
        Transaction t11 = new Transaction(11, new Date(18/11/9), 126, 183, (long)444.4, "Money");
        Transaction t12 = new Transaction(12, new Date(18/11/9), 627, 124, (long)444.4, "Money");
                 
        transactionDB.add(t1);
        transactionDB.add(t2);
        transactionDB.add(t3);
        transactionDB.add(t4);
        transactionDB.add(t5);
        transactionDB.add(t6);
        
        transactionDB.add(t7);
        transactionDB.add(t8);
        transactionDB.add(t9);
        transactionDB.add(t10);
        transactionDB.add(t11);
        transactionDB.add(t12);
        
        init = false;
        
        }
    } 
    
    public List<Transaction> getAllTransactions(){
        return this.transactionDB;
    }
    
    public ArrayList<Transaction> getTransactionsByAcc(int accNo){
        ArrayList <Transaction> statement =  new ArrayList<>();
        
        for (Transaction t: getAllTransactions()) {
            if((t.getTransactionFrom() == (accNo)) || (t.getTransactionTo() == (accNo))){
               statement.add(t);
            }
        }
        return statement;
    }
    
    public ArrayList<Transaction> getTransactionsByAcc(int accNo, int month){
        ArrayList <Transaction> statement =  new ArrayList<>();
        
        for (Transaction t: getAllTransactions()) {
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
}