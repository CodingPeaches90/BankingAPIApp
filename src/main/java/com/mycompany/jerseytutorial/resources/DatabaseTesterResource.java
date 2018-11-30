/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.model.Message;
import com.mycompany.jerseytutorial.services.DatabaseTesterServices;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
public class DatabaseTesterResource {
    
    DatabaseTesterServices dbts = new DatabaseTesterServices();
    
    @GET
    public String getFilteredMessages(@QueryParam("message") String message, @QueryParam("author") String author) {
        
        return dbts.getCustomerTestTB().toString();
    }  
    
    @GET
    @Path("/getCust")
    public List<Customer> getCust() {
        
        return dbts.getCustomerTestTB();
    }
}
