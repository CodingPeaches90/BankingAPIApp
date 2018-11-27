/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.services.AccountService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Christopher Kambayi
 */
@Path("/account")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource 
{
    /**/
    AccountService ar = new AccountService();
    
    /* Get Account by AccNo */
    @GET
    @Path("/{id}")
    public Account getAccountByNo(@PathParam("id") int id)
    {
        System.out.println("HIT");
        return ar.getAccountByNumber(id);
    }
    
    /* Get Account by UID */
    @GET
    @Path("/{uid}")
    public Account getAccountByUID(@PathParam("uid") int uid)
    {
        System.out.println("HIT");
        return ar.getAccountByUID(uid);
    }
}