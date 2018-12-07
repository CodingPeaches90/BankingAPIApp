package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.database.Database;
import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher Kambayi
 * 
 */

public class AccountService{ 
    
    /*database object  */
    Database db = new Database();
    
    /* Constructor */
    public AccountService() {
        
    }
     
    /* Get all accounts */
    public List<Account> getAllAccounts(){
        return db.getAccountTB();
    }
    
    /* Get Account by AccountNumber */
    public Account getAccountByNumber(int accNo){
        Account acc = new Account();
        
        for (Account q: db.getAccountTB()) {
            if (q.getAccountNo() == (accNo)){
               acc = q;
            }
        }
        return acc;
    }
    
    /* Get Account by UID */
    public Account getAccountByUID(int uid){
        Account acc = new Account();
        
        for (Account q: db.getAccountTB()) {
            if (q.getCustomerID() == (uid)){
               acc = q;
            }
        }
        return acc;
    }
    
    /* Get Account balance */
    public float getAccountBalance(int accNo){

        for (Account q: db.getAccountTB()) {
            if (q.getAccountNo() == (accNo)){
               return q.getBalance();
            }
        }
        return 0;
    }
    
    /* Create Account */
    public boolean addAccount(Account ac){
        int before = db.getAccountTB().size();
        db.addAccount(ac);
        int after = db.getAccountTB().size();
        
        if(after > before){
            return true;
        }
        return false;
    }
    
    /* Create Account */
    public boolean addAccountByCustomer(Customer c){
        int before = db.getAccountTB().size();
        Account tmp = new Account();
        tmp.setCustomerID(c.getCustomerUID());
        tmp.setAccountNo(db.getAccountTB().size() + 1);
        db.addAccount(tmp);
        int after = db.getAccountTB().size();
        if(after > before){
            System.out.println("Account by Customer Success");
            return true;
        }
        return false;
    }
    
    /* Delete Account */
    public boolean deleteAccount(Account ac){
        
        return db.deleteAccount(ac);
    }
    
    /* Delete Account */
    public boolean withdraw(int acc, int amount){
        
        return db.withdraw(acc, amount);
    }
    
    /* Delete Account */
    public boolean lodge(int acc, int amount){
        
        return db.lodge(acc, amount);
    }
    
    /* Delete Account */
    public boolean transfer(int accFrom, int accTo, int amount){
        
        return db.transfer(accFrom, accTo, amount);
    }
}