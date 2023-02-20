package net.flix;

public class Movie {
    // fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double  revenue;
    private Rating  rating;
    private Genre   genre;

    // constructors
    public Movie() {
       // no-op
    }

    public Movie(String title, Genre genre, Double revenue, Rating rating) {
        setTitle(title);
        setGenre(genre);
        setRevenue(revenue);
        setRating(rating);
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie (String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Genre genre, Integer  releaseYear, Double revenue, Rating rating) {
        this(title);                        // delegate to neighboring ctor above me for Title
        setReleaseYear(releaseYear);        // handle release year myself by delegating to its setter
        setRevenue(revenue);                // ditto here
        setRating(rating);
        setGenre(genre);
    }

    // business-oriented methods - deliberately omitted
    // play(), pause(), stop(), rewind(), fastForward(),

    //accessor methods (get/set methods)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("Movie: title=%s, releaseYear=%s, revenue=$%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: Title = " + getTitle() + ", releaseYear=" + getReleaseYear() +
//                ", revenue=" + getRevenue() + ", rating=" + getRating() + ", genre=" + getGenre();
    }
}