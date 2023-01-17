public class Movie {
    private String id;
    private String MovieName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieYear() {
        return MovieYear;
    }

    public void setMovieYear(String movieYear) {
        MovieYear = movieYear;
    }

    public String getMovieCategories() {
        return MovieCategories;
    }

    public void setMovieCategories(String movieCategories) {
        MovieCategories = movieCategories;
    }

    public ArrayList getCustomercustomerMovie() {
        return CustomercustomerMovie;
    }

    public void setCustomercustomerMovie(ArrayList customercustomerMovie) {
        CustomercustomerMovie = customercustomerMovie;
    }

    private String MovieYear;
    private String MovieCategories;
    private ArrayList CustomercustomerMovie;

    public void ShowAllMovie(ArrayList Movie movies) {
        for (Movie movie movies) {//foreach
            System.out.println(movie.getid());
            System.out.println(movie.getMovieName());
            System.out.println(movie.getMovieCategories());
            System.out.println(movie.getMovieYear());
        }
    }
}