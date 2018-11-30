/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import com.mycompany.jerseytutorial.database.DatabaseTester;

/**
 *
 * @author chris_xtx7ln9
 */
public class MainTester {
    
    public static void main(String...args)
    {
        DatabaseTester t = new DatabaseTester();
        
        System.out.println(t.getAllCustomers().toString());
              
    }  
}
