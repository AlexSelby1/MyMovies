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
public class Account {
    private long accountID;
    private String userName;
    private String password;

    public Account() {  
    }
    
    public Account(long accountID, String userName, String password) {
        this.accountID = accountID;
        this.userName = userName;
        this.password = password;
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
