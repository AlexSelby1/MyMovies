package com.mycompany.mymovies1.resources;

import com.mycompany.mymovies1.model.Movie;
import com.mycompany.mymovies1.service.MovieService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
@Path("/movies")
public class MovieResource {
    MovieService movieService = new MovieService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getListOfMoviesXML(){
        return movieService.getAllMovies();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getListOfMoviesJSON(){
        return movieService.getAllMovies();
    }
    
    @GET
    @Path ("/{movieID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMovieJSON(@PathParam("movieID") int id){
        return movieService.getMovies(id);
    }
    
    @GET        
    @Path ("/{movieID}")
    @Produces(MediaType.APPLICATION_XML)
    public Movie getMovieXML(@PathParam("movieID") int id){
        return movieService.getMovies(id);
    }
}
