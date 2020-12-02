/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymovies1.model;

/**
 *
 * @author Alex.Selby
 */
public class Customer {
    
    private long customerID;
    private String name;
    private String address;
    private String email;

    public Customer() {
   }

    public Customer(long customerID, String name, String address, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}


