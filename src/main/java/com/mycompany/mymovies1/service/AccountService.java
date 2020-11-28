
package com.mycompany.mymovies1.service;

import com.mycompany.mymovies1.model.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex.Selby
 */
public class AccountService {
        public static List<Account> accList = new ArrayList<>();
    public static boolean init = true;
    
        public AccountService() {
        if (init) {
            Account a1 = new Account(1, "J.RashFord1", "iLoveMovies181");
            Account a2 = new Account(2, "RachelRashford97", "RR231097movies");
            Account a3 = new Account(3, "JSparrow12", "castletownHome184");
            Account a4 = new Account(4, "EmerOD", "ItIsMovieTime");
            Account a5 = new Account(5, "MaryM123", "myAccount#1");
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
   
}


