package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.database.Database;
import com.mycompany.jerseytutorial.model.Customer;
import java.util.List;

/**
 *
 * @author jordanmay
 * 
 */

public class CustomerService 
{
        /*database object  */
    Database db = new Database();
    
    public CustomerService(){
        
    }
    
    /* Get Customer By UID */
    public Customer getCustomerByUID(int UID)
    {
        Customer cu = new Customer();
        for(Customer c : db.getCustomerTB())
        {
            if(c.getCustomerUID() == UID)
            {
                cu = c;
            }
        }
        return cu;
    }
    
    /* Create Customer */
    public Customer addCustomer(Customer c)
    {
        c.setCustomerUID(db.getCustomerTB().size() + 1);
        //customerList.add(c);
        db.addCustomer(c);
        return c;
    }
}