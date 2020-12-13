
package com.mycompany.mymovies1.service;

import com.mycompany.mymovies1.model.Admin;
import com.mycompany.mymovies1.model.Customer;
import com.mycompany.mymovies1.service.CustomerService;
import com.mycompany.mymovies1.model.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex.Selby
 */
public class AdminService {
    public static List<Admin> adList = new ArrayList<>();
   // public static List<Customer> custList = new ArrayList<>();
    public static List<Movie> movieList = new ArrayList<>();
    public static boolean init = true;
    MovieService movieService = new MovieService();
    CustomerService customerService = new CustomerService();
    
    public AdminService(){
        if(init){
            //Adding list of Admins just in case.
            //Might want it for passing parameters or may not be needed
            Admin ad1 = new Admin("Lukasz1Plawinski", "x19206968");
            Admin ad2 = new Admin("Conor1Dixon", "x19222114");
            Admin ad3 = new Admin("Alex1Selby", "x13122657");
            adList.add(ad1);
            adList.add(ad2);
            adList.add(ad3);
        }
    }
    //Get all customers, get specific customer, post new customer
         public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
        }
        public Customer getCustomer(int id) {
        return customerService.getCustomer(id);
    }  
        public Customer createCustomer(Customer c) {
        c.setCustomerID(customerService.getAllCustomers().size() + 1);
        customerService.getAllCustomers().add(c);
        System.out.println("201 - resource created with path: /Customers/"
                + String.valueOf(c.getCustomerID()));
        return c;
    }
        //Get all movies, get specific movie, post new movie
        public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
        }
        public Movie getMovie(int id) {
        return movieService.getMovies(id);
    }  
        public Movie createMovie(Movie m) {
        m.setMovieID(movieService.getAllMovies().size() + 1);
        movieService.getAllMovies().add(m);
        System.out.println("201 - resource created with path: /Movies/"
                + String.valueOf(m.getMovieID()));
        return m;
    }
}

