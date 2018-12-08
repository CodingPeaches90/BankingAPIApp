package com.mycompany.jerseytutorial.resources;

import com.mycompany.jerseytutorial.model.Customer;
import com.mycompany.jerseytutorial.services.AccountService;
import com.mycompany.jerseytutorial.services.CustomerService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jordan May
 * 
 */

@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource{
    /**/
    CustomerService cs = new CustomerService();
    AccountService as = new AccountService();
    
    /**
    * Get Customer by Id
    * URL: http://localhost:49000/api/customer/{id}
    * 
    * Example: http://localhost:49000/api/customer/2
    */
    @GET
    @Path("/{id}")
    public Customer getCustomerByID(@PathParam("id") int id){
        System.out.println("Success: Got customer by ID");
        return cs.getCustomerByUID(id);
    }
    
    /**
    * Create Customer 
    * URL: http://localhost:49000/api/customer/create
    */
    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    public void createCustomer(Customer c){
        if(cs.addCustomer(c) && as.addAccountByCustomer(c)){
            System.out.println("Customer + Account created successfully");
        }
        else{
            System.out.println("FAIL: Customer + Account not created!");
        }
    }
    
    /**
    * Update Customer Details
    * URL: http://localhost:49000/api/customer/update
    */
    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateCustomer(Customer c){
        if(cs.updateCustomerDetails(c)){
            System.out.println("Update customer details");
        }
        else{
            System.out.println("FAIL: Customer not updated!");
        }
    }
    
    /**
    * Delete Customer
    * URL: http://localhost:49000/api/customer/delete
    */
    @DELETE
    @Path("/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteCustomer(Customer c){
        
        if(cs.deleteCustomer(c)){
            System.out.println("Delete Successfull");
        }
        else{
            System.out.println("FAIL: Customer no deleted!");
        }
    }
}