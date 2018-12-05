/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.services.TransactionService;
import com.mycompany.jerseytutorial.model.Transaction;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Christopher Kambayi
 * 
 */

@Path("/transaction")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransactionResource {
    /*   */
    TransactionService tr = new TransactionService();
    
    /* Get Transaction */
    @GET
    public List<Transaction> getTransactions(){
        System.out.println("Success: Got all transactions");
        return tr.getAllTransactions();
    }
    
    /* Get Transaction by account */
    @GET
    @Path("/account/{accNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getTransactionByAcc(@PathParam("accNo") int accNo){
        System.out.println("Success: Got transaction by account number");
        return tr.getTransactionsByAcc(accNo);
    }
    
    /* Create Transaction */
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postTransaction(Transaction t){
        if(tr.addTransaction(t)){
            System.out.println("Success: Posted transaction");
        }
        else{
            System.out.println("FAIL: Transaction not posted");
        }
    }
    
    /* Create Derict Debit */
    @POST
    @Path("/create/directdebit")
    @Consumes(MediaType.APPLICATION_JSON)
    public void postDirectDebit(Transaction t){
        if(tr.addDirectDebit(t)){
            System.out.println("Success: Posted Direct Debit");
        }
        else{
            System.out.println("FAIL: Direct Debit not posted");
        }
    }
    
    /* Create Mobile Top Up */
    @POST
    @Path("/create/mobiletopup")
    @Produces(MediaType.APPLICATION_JSON)
    public void postMobileTopUp(Transaction t){
        if(tr.addMobileTopUp(t)){
            System.out.println("Success: Mobile TopUp");
        }
        else{
            System.out.println("FAIL: TopUp not posted");
        }
    }
    
    /* GET Derict Debit */
    @GET
    @Path("/directdebit/{accNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getDirectDebit(@PathParam("accNo") int accNo){
        System.out.println("Success: Got direct debits");
        return tr.getDirectDebit(accNo);
    }
    
    /* GET Mobile Top Up */
    @GET
    @Path("/mobiletopup/{accNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getMobileTopUp(@PathParam("accNo") int accNo){
        System.out.println("Success: Got mobile topup");
        return tr.getMobileTopUp(accNo);
    }
}