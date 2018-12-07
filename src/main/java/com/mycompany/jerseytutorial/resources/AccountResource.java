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
 * @author Christopher Kambayi
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
    */
    @GET
    @Path("/accountNumber/{accNo}")
    public Account getAccountByNo(@PathParam("accNo") int accNo){
        System.out.println("HIT");
        return as.getAccountByNumber(accNo);
    }
    
    /**
    * Get Account by UID
    */
    @GET
    @Path("/uid/{uid}")
    public Account getAccountByUID(@PathParam("uid") int uid){
        System.out.println("HIT");
        return as.getAccountByUID(uid);
    }
    
    /**
    * Get Account balance
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
    * Create Account
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
}