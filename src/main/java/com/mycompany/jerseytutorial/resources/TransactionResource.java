/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.services.TransactionService;
import com.mycompany.jerseytutorial.model.Transaction;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
/**
 *
 * @author chris_xtx7ln9
 */
@Path("/transaction")
public class TransactionResource {
    /**/
    TransactionService tr = new TransactionService();
    
    /* Get Transaction */
    @GET
    public List<Transaction> getTransactions()
    {
        System.out.println("HIT");
        return tr.getAllTransactions();
    }
    
    /* Get Transaction by account */
    @GET
    @Path("/account/{accNo}")
    public List<Transaction> getTransactionByAcc(@PathParam("accNo") int accNo)
    {
        System.out.println("HIT");
        return tr.getTransactionsByAcc(accNo);
    }
    
    /* Create Account */
    @POST
    public Transaction createTransaction(Transaction t)
    {
        return tr.addTransaction(t);
    }
}