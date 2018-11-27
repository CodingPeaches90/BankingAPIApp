/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.model;

import java.util.Date;

/**
 *
 * @author jordanmay
 * 
 * INT CustomerAccountUID is the ID of the Account
 */
public class Customer 
{
    private String customerFName;
    private String customerLName;
    private String customerAddress;
    private String customerPPSN;
    private int customerSortCode;
    private int customerUID;
    private Date customerJoinedDate;
    
    public Customer() {}
    
    public Customer(String customerFName, String customerLName, String customerAddress, String customerPPSN, int customerSortCode,int customerUID)
    {
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.customerAddress = customerAddress;
        this.customerPPSN = customerPPSN;
        this.customerSortCode = customerSortCode;
        this.customerUID = customerUID;
        this.customerJoinedDate = new Date();
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPPSN() {
        return customerPPSN;
    }

    public int getCustomerSortCode() {
        return customerSortCode;
    }

    public int getCustomerUID() {
        return customerUID;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPPSN(String customerPPSN) {
        this.customerPPSN = customerPPSN;
    }

    public void setCustomerSortCode(int customerSortCode) {
        this.customerSortCode = customerSortCode;
    }

    public void setCustomerUID(int customerUID) {
        this.customerUID = customerUID;
    }
}

    
