/*
 */
package com.mycompany.mymovies1.service;

import com.mycompany.mymovies1.model.Account;
import com.mycompany.mymovies1.model.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Selby, Conor Dixon, Lukasz Plawinski
 */
public class MovieService {
    public static List<Movie> movieList = new ArrayList<>();
    public static boolean init = true;
    
        public MovieService() {
        if (init) {
            Movie m1 = new Movie(1, "The Shawshank Redemption", "1994",
            "Andy Dufresne (Tim Robbins) is sentenced to two consecutive life terms in prison for the murders of his wife and her lover and is sentenced to a tough prison. However, only Andy knows he didn't commit the crimes.",false,false);
            Movie m2 = new Movie(2, "Intouchables", "2011",
                    "A Parisian aristocrat, quadriplegic since a paragliding accident, hires a young man to be his live-in caretaker. Although very different the two men bond and develop a close friendship.",false,false);
            Movie m3 = new Movie(3, "The Green Mile", "1999","Paul Edgecomb (Tom Hanks) walked the mile with a variety of cons. He had never encountered someone like John Coffey (Michael Clarke Duncan), a massive black man convicted of brutally killing a pair of young sisters. Coffey had the size and strength to kill anyone, but not the demeanor.",false,false);
            Movie m4 = new Movie(4, "The Godfather", "1972","The Godfather/Film synopsis\n" +
"This is the epic tale of a 1940s New York Mafia family and their struggle to protect their empire from rival families as the leadership switches from the father to his youngest son.",false,false);
            Movie m5 = new Movie(5, "Forest Gump", "1994","Slow-witted Forrest Gump (Tom Hanks) has never thought of himself as disadvantaged, and thanks to his supportive mother (Sally Field), he leads anything but a restricted life. Whether dominating on the gridiron as a college football star, fighting in Vietnam or captaining a shrimp boat, Forrest inspires people with his childlike optimism",false,false);
            movieList.add(m1);
            movieList.add(m2);
            movieList.add(m3);
            movieList.add(m4);
            movieList.add(m5);
            init = false;
        }
    }
            public List<Movie> getAllMovies() {
        return movieList;
    }
           public Movie getMovies(int id) {
        return movieList.get(id - 1);
    }   
}
