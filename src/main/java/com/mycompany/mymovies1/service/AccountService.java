
package com.mycompany.mymovies1.service;

import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
public class AccountService {
//    Variables
    public static boolean init = true;
    
//    Objects
    public static List<Account> accList = new ArrayList<>();
    MovieService movieService=new MovieService();
    
//    Fills up accList with new Accounts
    public AccountService() {
        if (init) {
            Account a1 = new Account(1,1, "J.RashFord1", "iLoveMovies181");
            Account a2 = new Account(1,2, "RachelRashford97", "RR231097movies");
            Account a3 = new Account(1,3, "JSparrow12", "castletownHome184");
            Account a4 = new Account(2,4, "EmerOD", "ItIsMovieTime");
            Account a5 = new Account(2,5, "MaryM123", "myAccount#1");
            accList.add(a1);
            accList.add(a2);
            accList.add(a3);
            accList.add(a4);
            accList.add(a5);
            init = false;
        }
    }
    public List<Account> getAllAccounts() {
        return accList;
    }
    public Account getAccount(int id) {
        return accList.get(id - 1);
    }   
    public Account createAccount(Account a) {
        a.setAccountID(accList.size() + 1);
        accList.add(a);
        System.out.println("201 - resource created with path: /Accounts/"
                + String.valueOf(a.getAccountID()));
        return a;
    }
    
    public List<Movie> getMyMovies(long accountID){
        Account matchedAcc=this.getAccount((int)accountID);
        return matchedAcc.getMyList();
    }
        
    //Method which adds Movie to personal movieList from global List by account id and movie ID
    public String addMovie(long movieID,long accountID){
//        Objects
        Account matchedAcc=new Account();
        Movie addedMovie=new Movie();
        
        for(Account acc: this.getAllAccounts()){
            if(accountID==acc.getAccountID()){
                matchedAcc=acc;
            }
        }
        for (Movie m: movieService.getAllMovies()) {
            if ( m.getMovieID()==movieID) {
                matchedAcc.addMovie(m);
                addedMovie=m;
            }

        }
        return addedMovie.getMovieName();

    }
    
    public String deleteMovie(long movieID,long accountID){
//        Objects
        Account matchedAcc=new Account();
        Movie deletedMovie=new Movie();
        
        for(Account acc: this.getAllAccounts()){
            if(accountID==acc.getAccountID()){
                matchedAcc=acc;
            }
        }

        for (Movie m: matchedAcc.getMyList()) {
            if ( m.getMovieID()==movieID) {
                deletedMovie=m;
            }

        }
        
        matchedAcc.getMyList().remove(deletedMovie);
        
        return deletedMovie.getMovieName();

    }
//    Method which updates Movie watched and recommended parameters
    public Movie updateMovie(long movieID,long accountID,Movie m){
        Account matchedAcc=new Account();
        Movie movieToUpdate=new Movie();
        for(Account acc: this.getAllAccounts()){
            if(accountID==acc.getAccountID()){
                matchedAcc=acc;
            }
        }
        for(Movie movie: matchedAcc.getMyList()){
            if(movieID==movie.getMovieID()){
                movieToUpdate=movie;
                movieToUpdate.setWatched(m.isWatched());
                movieToUpdate.setRecommended(m.isRecommended());                   
            }

        }

        return movieToUpdate;
    }
   
}


