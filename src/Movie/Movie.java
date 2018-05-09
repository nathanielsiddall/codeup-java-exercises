package Movie;

public class Movie {

    public String name;
    public String category;

    public Movie(String filmName, String filmCategory){
        name = filmName;
        category = filmCategory;
    }

    public static String getMovieData(Movie) {
        String data = Movie.name + Movie.category;
        return data;

    }
}
