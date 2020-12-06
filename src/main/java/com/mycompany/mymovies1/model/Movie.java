/*
 */
package com.mycompany.mymovies1.model;

/**
 *
 * @author User
 */

public class Movie {

//Variables
    private long accountID;
    private long customerID;
    private String movieName;
    private String releaseDate;
    private String summary;
    private boolean watched;
    private boolean recommended;

//    Constructor
    public Movie(long accountID,long customerID,String movieName, String releaseDate,String summary,boolean watched,boolean recommended) {
        this.accountID=accountID;
        this.customerID=customerID;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.summary = summary;
        this.watched = watched;
        this.recommended = recommended;
    }
    
//    Getters and Setters
    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID =
                accountID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID =
                customerID;
    }
    
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName =
                movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate =
                releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary =
                summary;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched =
                watched;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended =
                recommended;
    }

    
}
