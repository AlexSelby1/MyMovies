package com.mycompany.mymovies1.resources;
import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Movie;
import com.mycompany.mymovies1.service.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
@Path("/accounts")
public class AccountResource {
//  Account Service object
    AccountService accountService = new AccountService();
    

    
    @GET
    @Path ("/{accountID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountJSON(@PathParam("accountID") int id){
        return accountService.getAccount(id);
    }

    @GET
    @Path ("/{accountID}")
    @Produces(MediaType.APPLICATION_XML)
    public Account getAccountXML(@PathParam("accountID") int id){
        return accountService.getAccount(id);
    }

    @POST
    @Path ("/{accountID}/addMovie/{movieID}")
    public String addMovie(@PathParam("movieID")long movieID,@PathParam("accountID") long accountID){
        return accountService.addMovie(movieID,accountID);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path ("/{accountID}/updateMovie/{movieID}/")
    public Movie updateMovie(@PathParam("movieID")long movieID,@PathParam("accountID") long accountID,Movie m){
        return accountService.updateMovie(movieID, accountID, m);
    }
}
