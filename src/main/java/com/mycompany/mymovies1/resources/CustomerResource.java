/*
 */
package com.mycompany.mymovies1.resources;
import com.mycompany.mymovies1.model.Customer;
import com.mycompany.mymovies1.service.CustomerService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Alex.Selby
 */
@Path("/customers")
public class CustomerResource {
    CustomerService customerService = new CustomerService();
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
}
