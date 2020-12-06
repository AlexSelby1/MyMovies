package com.mycompany.mymovies1.service;

import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
public class CustomerService {
    
    public static List<Customer> custList = new ArrayList<>();
    public static boolean init = true;
    AccountService accService = new AccountService();
    
        public CustomerService() {
        if (init) {
            Customer c1 = new Customer(1, "John Rashford", "27 Greenfort, Dublin", "john.rashford@gmail.com");
            Customer c2 = new Customer(2, "Jack Sparrow", "18 Ferndale, Galway", "jacks@gmail.com");
            Customer c3 = new Customer(3, "Emer O'Donnell", "133 Castle Town, Laois", "EmerOD@hotmail.com");
            Customer c4 = new Customer(4, "Mary Martin", "19 Wood Lodge, Meath", "M.Martin10@hotmail.com");
            custList.add(c1);
            custList.add(c2);
            custList.add(c3);
            custList.add(c4);
            init = false;
        }
    }
            public List<Customer> getAllCustomers() {
        return custList;
    }
           public Customer getCustomer(int id) {
        return custList.get(id - 1);
    }   
               //Getting all accounts by customerID
    public List<Account> getAllAccountsByCustomer(int id) {
        List<Account> matcheslist = new ArrayList<>();
        for (Account b : accService.getAllAccounts()) {
            if ((b.getCustomerID() == (id))) {
                matcheslist.add(b);
            }
        }
        return matcheslist;
    }
   
}
