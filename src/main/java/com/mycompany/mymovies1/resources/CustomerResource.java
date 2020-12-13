package com.mycompany.mymovies1.resources;
import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Customer;
import com.mycompany.mymovies1.model.Movie;
import com.mycompany.mymovies1.service.AccountService;
import com.mycompany.mymovies1.service.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
@Path("/customers")
public class CustomerResource {
//    Objects
    CustomerService customerService = new CustomerService();
     AccountService accountService = new AccountService();
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomersJSON(){
        return customerService.getAllCustomers();
    }
    
    @GET
    @Path ("/{customerID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomersJSON(@PathParam("customerID") int id){
        return customerService.getCustomer(id);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomerXML(){
        return customerService.getAllCustomers();
    }
    
    @GET
    @Path ("/{customerID}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerXML(@PathParam("customerID") int id){
        return customerService.getCustomer(id);
    }
    
    @GET
    @Path ("/{customerID}/accounts")
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getAllAccountsbyCustomerXML(@PathParam("customerID") int id){
        return customerService.getAllAccountsByCustomer(id);
    }
    
    @GET
    @Path ("/{customerID}/accounts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getAllAccountsbyCustomerJSON(@PathParam("customerID") int id){
        return customerService.getAllAccountsByCustomer(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path ("/{customerID}/create")
    public Account createAccount(Account acc){
        return accountService.createAccount(acc);
    }
    
    @PUT
    @Path ("/{customerID}/transferMovie/{movieID}")
    public Movie transferMovie(@PathParam("movieID") long movieID,@QueryParam("fromID") long fromID,@QueryParam("toID") long toID){
        return customerService.transferMovie(movieID,fromID,toID);
    }
}
