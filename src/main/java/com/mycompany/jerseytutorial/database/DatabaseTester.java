/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.database;

import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.model.Transaction;
import java.util.List;

/**
 *
 * @author chris_xtx7ln9
 * 
 */

public class DatabaseTester {
    
       /*database object  */
    Database db = new Database();
    private List<Customer> customerTestTB = db.getCustomerTB();
    private List<Account> accountTestTB = db.getAccountTB();
    private List<Transaction> transactionTestTB = db.getTransactionTB();
    
    public List getAllCustomers(){
        return customerTestTB;
    }
    
    public List getAllAccounts(){
        return accountTestTB;
    }
    
    public List getAllTransactions(){
        return transactionTestTB;
    }
    
    /* endpoints */
    
}