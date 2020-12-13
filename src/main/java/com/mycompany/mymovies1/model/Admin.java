
package com.mycompany.mymovies1.model;
/**
 *
* @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */

public class Admin {
//    Variables
    private String userName;
    private String password;

//    Constructors
    public Admin() {
    }

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
//    Setters and Getters
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

