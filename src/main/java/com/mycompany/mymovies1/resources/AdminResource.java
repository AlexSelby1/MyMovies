
package com.mycompany.mymovies1.resources;

import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Customer;
import com.mycompany.mymovies1.model.Movie;
import com.mycompany.mymovies1.service.AdminService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
* @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */

@Path("/admin")
public class AdminResource {
//  Admin service object
    AdminService adminService= new AdminService();
    
    @GET
    @Path("/accounts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getAccountsJSON(){
        return adminService.getAllAccounts();
    }
    @GET
    @Path ("/customers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAllCustomersJSON(){
        return adminService.getAllCustomers();
    }
    
    @GET
    @Path ("/customers")
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getAllCustomersXML(){
        return adminService.getAllCustomers();
    }
    
    @GET
    @Path ("/customers/{customerID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomersJSON(@PathParam("customerID") int id){
        return adminService.getCustomer(id);
    }
    
    @GET
    @Path ("/customers/{customerID}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomersXML(@PathParam("customerID") int id){
        return adminService.getCustomer(id);
    }
    
    @POST
    @Path ("/customers/create")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer createCustomer(Customer c){
        return adminService.createCustomer(c);
    }
    
    @GET
    @Path ("/movies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getAllMoviesJSON(){
        return adminService.getAllMovies();
    }
    
    @GET
    @Path ("/movies")
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getAllMoviesXML(){
        return adminService.getAllMovies();
    }
    
    @GET
    @Path ("/movies/{movieID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMovieJSON(@PathParam("movieID") int id){
        return adminService.getMovie(id);
    }
    
    @GET
    @Path ("/movies/{movieID}")
    @Produces(MediaType.APPLICATION_XML)
    public Movie getMovieXML(@PathParam("movieID") int id){
        return adminService.getMovie(id);
    }
    
    @POST
    @Path ("/movies/create")
    public Movie createMovie(Movie m){
        return adminService.createMovie(m);
    }
    
}

