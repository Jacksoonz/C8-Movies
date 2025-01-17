import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
        for(int i=0 ; i<movies.length ; i++){
            pool.add(movies[i]);
        }
    }

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        ArrayList<Movie> a = new ArrayList<Movie>();
        for(int i=0 ; i<pool.size() ; i++){
            if(pool.get(i).getStudio().equals(studio)){
                a.add(pool.get(i));
            }
        }
        return a;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        Movie m = movies.get(0);
        double bigrating = m.getRating();
        for(int i=0 ; i<pool.size() ; i++){
            if(pool.get(i).getRating() > bigrating){
                m = movies.get(i);
                bigrating = m.getRating();
            }
        }
        return m;
    }
    
    

    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        Movie disney = getHighestrating(getByStudio( "Disney" ));
        Movie ghibli = getHighestrating(getByStudio( "Ghibli" ));
        Movie indy = getHighestrating(getByStudio( "Indy" ));
        ArrayList<Movie> biggest = new ArrayList<Movie>();
        biggest.add(disney);
        biggest.add(ghibli);
        biggest.add(indy);
         
        // return highestRated;
        return biggest;
    }

}
