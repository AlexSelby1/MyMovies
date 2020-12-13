package com.mycompany.mymovies1.model;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
public class Customer {
    
//    Variables
    private long customerID;
    private String name;
    private String address;
    private String email;

//    Constructors
    public Customer() {
   }

    public Customer(long customerID, String name, String address, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.email = email;
    }

//    Setters and Getters
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


