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

    private boolean watched;
    private boolean recommended;
    

//    Constructors
    public Movie() {
        
    }
    public Movie(boolean watched,boolean recommended) {
        this.watched = watched;
        this.recommended = recommended;
    }
    public Movie(long movieID,String movieName, String releaseDate,String summary,boolean watched,boolean recommended) {
        this.movieID=movieID;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.summary = summary;
        this.watched = watched;
        this.recommended = recommended;
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
