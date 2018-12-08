/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.services.AccountService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jordan May
 * 
 */

@Path("/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource {
    /**
    * Account service
    */
    AccountService as = new AccountService();
    
    /**
    * Get Account by AccNo
    * URL: http://localhost:49000/api/account/accountNumber/{accNo}
    * 
    * Example: http://localhost:49000/api/account/accountNumber/123
    */
    @GET
    @Path("/accountNumber/{accNo}")
    public Account getAccountByNo(@PathParam("accNo") int accNo){
        System.out.println("HIT");
        return as.getAccountByNumber(accNo);
    }
    
    /**
    * Get Account by UID
    * URL: http://localhost:49000/api/account/uid/{uid}
    * 
    * Example: http://localhost:49000/api/account/uid/1
    */
    @GET
    @Path("/uid/{uid}")
    public Account getAccountByUID(@PathParam("uid") int uid){
        System.out.println("HIT");
        return as.getAccountByUID(uid);
    }
    
    /**
    * Get Account balance
    * URL: http://localhost:49000/api/account/balance/{accNo}
    * 
    * Example: http://localhost:49000/api/account/balance/124
    */
    @GET
    @Path("/balance/{accNo}")
    public float getAccountBalance(@PathParam("accNo") int accNo){
        float bal =  as.getAccountBalance(accNo);
        System.out.println("Balance for "+accNo+" is = "+ bal);
        return bal;
    }
    
    /**
    * Create Account
    * URL: http://localhost:49000/api/account/create
    */
    @POST
    @Path("/create")
    public void createAccount(Account c){
        if(as.addAccount(c)){
            System.out.println("Success: Account created!");
        }
        else{
            System.out.println("FAIL: Account not created!");
        }
    }
   
    /**
    * Delete Account
    * URL: http://localhost:49000/api/account/delete
    */
    @DELETE
    @Path("/delete")
    public void deleteAccount(Account c){
        if(as.deleteAccount(c)){
            System.out.println("Success: Account deleted");
        }
        else{
            System.out.println("FAIL: Account not deleted!");
        }
    }
    
    /**
    * Lodge
    * URL: http://localhost:49000/api/account/lodge/{accNo}/{amount}
    * 
    * Example: http://localhost:49000/api/account/124/500
    */
    @POST
    @Path("/lodge/{accNo}/{amount}")
    public void lodge(@PathParam("accNo") int accNo, @PathParam("amount") int amount){
        if(as.lodge(accNo, amount)){
            System.out.println("Lodged " + amount+" To: " + accNo);
        }
        else{
            System.out.println("FAIL: Lodgement unsuccessful");
        }
    }
    
    /**
    * Withdraw
    * URL: http://localhost:49000/api/account/withdraw/{accNo}/{amount}
    * 
    * Example: http://localhost:49000/api/account/withdraw/123/980
    */
    @POST
    @Path("/withdraw/{accNo}/{amount}")
    public void withdraw(@PathParam("accNo") int accNo, @PathParam("amount") int amount){
        if(as.withdraw(accNo, amount)){
            System.out.println("Withdrew " + amount+ " From: "+ accNo);
        }
        else{
            System.out.println("FAIL: Withdraw unsuccessful");
        }
    }
    
    /**
    * Transfer
    * URL: http://localhost:49000/api/account/transfer/{accFrom}/{accTo}/{amount}
    * 
    * Example: http://localhost:49000/api/account/transfer/123/124/554.21
    */
    @POST
    @Path("/transfer/{accFrom}/{accTo}/{amount}")
    public void transfer(@PathParam("accFrom") int accFrom, @PathParam("accTo") int accTo, @PathParam("amount") int amount){
        if(as.transfer(accFrom, accTo, amount)){
            System.out.println("Transfered " + amount+ " from "+ accFrom + " To" + accTo);
        }
        else{
            System.out.println("FAIL: Transfer unsuccessful");
        }
    }
}