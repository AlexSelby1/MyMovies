/*
 */
package com.mycompany.mymovies1.resources;
import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.service.AccountService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
@Path("/accounts")
public class AccountResource {
    AccountService accountService = new AccountService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getAccountsJSON(){
        return accountService.getAllAccounts();
    }
    @GET
    @Path ("/{accountID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountJSON(@PathParam("accountID") int id){
        return accountService.getAccount(id);
}
        @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getAccountsXML(){
        return accountService.getAllAccounts();
    }
    @GET
    @Path ("/{accountID}")
    @Produces(MediaType.APPLICATION_XML)
    public Account getAccountXML(@PathParam("accountID") int id){
        return accountService.getAccount(id);
}

}
