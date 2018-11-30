package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.database.Database;
import com.mycompany.jerseytutorial.model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher Kambayi
 * 
 */

public class AccountService{ 
    
    /* Create mock DB*/
    private static List<Account> accountDB = new ArrayList<>();
    public static boolean init = true;
    
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
        Account acc = new Account();
        
        for (Account q: db.getAccountTB()) {
            if (q.getAccountNo() == (accNo)){
               acc = q;
            }
        }
        return acc.getBalance();
    }
    
    /* Create Account */
    public Account addAccount(Account ac){
        db.addAccount(ac);
        return ac;
    }
}