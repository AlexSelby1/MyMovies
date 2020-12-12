/*
 */
package com.mycompany.mymovies1.model;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */

public class Movie {

//Variables
    private long movieID;
    private String movieName;
    private String releaseDate;
    private String summary;
    
    public Movie() {
        
    }
//    Constructor
    public Movie(long movieID,String movieName, String releaseDate,String summary) {
        this.movieID=movieID;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.summary = summary;
    }
    
//    Getters and Setters
    public long getMovieID() {
        return movieID;
    }

    public void setMovieID(long movieID) {
        this.movieID =
                movieID;
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

}
