package com.mycompany.mymovies1.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
public class Account {
//    Variables
    private long accountID;
    private String userName;
    private String password;
    private long customerID;
    private List<Movie> myList=new ArrayList<Movie>();
    
//    Displaying personal list of the movies
    public List<Movie> getMyList() {
        return myList;
    }

    public void setMyList(List<Movie> myList) {
        this.myList = myList;
    }
    
//    Adding movie to the personal list
    public void addMovie(Movie m){
        myList.add(m);
    }

//    Constructors
    public Account() {  
    }
    
    public Account(long customerID,long accountID, String userName, String password) {
        this.customerID=customerID;
        this.accountID = accountID;
        this.userName = userName;
        this.password = password;
    }
    
//    Setters and Getters
        public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID =
                customerID;
    }
    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
