package com.mycompany.service;

import com.mycompany.model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher Kambayi
 * 
 */

public class AccountService{ 
    
    private List<Account> accountDB = new ArrayList<>();
    public static boolean init = true;
    
    public AccountService() {
        if (init) 
        {
         
            Account a1 = new Account(123, 321, "Current", (float)43000);
            Account a2 = new Account(124, 322, "Current", (float)45000);
            Account a3 = new Account(125, 323, "Savings", (float)155000);
            Account a4 = new Account(183, 921, "Savings", (float)4000);
            Account a5 = new Account(126, 521, "Loan", (float)-4000);
            Account a6 = new Account(627, 221, "Loan", (float)-254954);

            accountDB.add(a1);
            accountDB.add(a2);
            accountDB.add(a3);
            accountDB.add(a4);
            accountDB.add(a5);
            accountDB.add(a6);

            init = false;
        }
    }
    
    public List<Account> getAllAccounts(){
        return this.accountDB;
    }
    
    public Account getAccountByNumber(int accNo){
        Account acc = new Account();
        
        for (Account q: getAllAccounts()) {
            if (q.getAccountNo() == (accNo)){
               acc = q;
            }
        }
        return acc;
    }
    
    public Account getAccountByUID(int uid){
        Account acc = new Account();
        
        for (Account q: getAllAccounts()) {
            if (q.getCustomerID() == (uid)){
               acc = q;
            }
        }
        return acc;
    }
    
    public int getAccountBalance(int accNo){
        Account acc = new Account();
        
        for (Account q: getAllAccounts()) {
            if (q.getAccountNo() == (accNo)){
               acc = q;
            }
        }
        return 0;
    }
}