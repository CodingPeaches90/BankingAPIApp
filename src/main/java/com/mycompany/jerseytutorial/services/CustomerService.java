package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.model.Account;
import com.mycompany.jerseytutorial.model.Customer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jordanmay
 * 
 */

public class CustomerService 
{
    
    private List<Customer> customerList = new ArrayList<>();
    private static boolean stop = true;
    
    public CustomerService()
    {
        while(stop)
        {
            Customer c1 = new Customer("Jordan","May",  "BollyWood", "w234", 1234 , 1);
            Customer c2 = new Customer("Christopher","Kambayi",  "Santry", "e344", 342 , 2);
            
            customerList.add(c1);
            customerList.add(c2);
            
            stop = false;
        }
    }
    
    /* Get Customer By UID */
    public Customer getCustomerByUID(int UID)
    {
        Customer cu = new Customer();
        for(Customer c : customerList)
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
        c.setCustomerUID(customerList.size() + 1);
        customerList.add(c);
        return c;
    }
}