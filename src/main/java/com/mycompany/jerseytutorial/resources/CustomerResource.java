package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.model.Customer;
import java.util.List;
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
 * @author jordanmay
 */
@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource 
{
    /**/
    CustomerResource cr = new CustomerResource();
    
    /* Get All Customers */
    
    /* Get Customer by Id */
    @GET
    @Path("/{id}")
    public int getCustomerByID(@PathParam("id") int id)
    {
        //System.out.println("HIT");
        return cr.getCustomerByID(id);
    }
    
    /* Create Customer */
    @POST
    public Customer createCustomer(Customer c)
    {
        return cr.createCustomer(c);
    }
}