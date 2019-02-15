enum genre {
    RAP, ROCK, COUNTRY, POP
}
/**
 * This class initialize a class named Album and 4 different instance variables for the title, artist, release year, and
 * the genre.
 */
public class Album {

    public String Title;
    public String artist;
    public int releaseYear;
    public genre genre;

    public Album(String Title, String artist, int releaseYear, genre genre) {
        this.Title = Title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }
    /**
     * creates a getter for the title.
     *
     * @return an <CODE>Title</CODE>  for the getter.
     */
    public String getTitle() {
        return Title;
    }
    /**
     * creates a getter for the artist.
     *
     * @return an <CODE>artist</CODE>  for the getter.
     */
    public String getArtist() {
        return artist;
    }
    /**
     * creates a getter for the release year.
     *
     * @return an <CODE>release year</CODE>  for the getter.
     */
    public int getReleaseYear(){
        return releaseYear;
    }
    /**
     * creates a getter for the genre.
     *
     * @return an <CODE>genre</CODE>  for the getter.
     */
    public genre getGenre() {
        return genre;
    }
    /**
     * Creates a toString method that allows it to display.
     *
     * @return an <CODE>Title</CODE> , <CODE>artist</CODE> , <CODE>release year</CODE> , <CODE>genre</CODE> .
     */
    public String toString() {
        return "\n" + "Title: " + this.Title + " Artist: " + this.artist + " ReleaseYear: " + this.releaseYear + " Genre: " + this.genre + "\n" ;
    }
}
