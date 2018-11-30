/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.database.Database;
import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.model.Transaction;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author chris_xtx7ln9
 */
@Path("/databasetest")
//@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DatabaseTesterServices {

    /*database object  */
    Database db = new Database();
    private List<Customer> customerTestTB = db.getCustomerTB();
    private List<Account> accountTestTB = db.getAccountTB();
    private List<Transaction> transactionTestTB = db.getTransactionTB();
    
    public DatabaseTesterServices() {
    }

    public Database getDb() {
        return db;
    }

    public List<Customer> getCustomerTestTB() {
        return customerTestTB;
    }

    public List<Account> getAccountTestTB() {
        return accountTestTB;
    }

    public List<Transaction> getTransactionTestTB() {
        return transactionTestTB;
    }   
}
