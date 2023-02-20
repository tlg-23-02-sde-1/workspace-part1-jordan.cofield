package net.flix;

public enum Genre {
    // each of these is calling the ctor below, passing a string
    COMEDY("Comedy"),
    HORROR("Horror"),
    ACTION("Action"),
    DRAMA("Drama"),
    FANTASY("Fantasy"),
    WESTERN("Western"),
    SCI_FI("Science Fiction"),
    ROMANCE("Romance");

    // -------
    // everything under this line is regular class defintion stuff
    // namely, fields, constructors, method
    // -------
    private String display;

    // constructor - called only from inside ( times, from those listed above)
    Genre(String display) {
        this.display = display;
        System.out.println("Genre ctor called");
    }

    public String getDisplay() {  //often the "get" prefix is omitted when there is no setter
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}