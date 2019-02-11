enum genre{
    ROCK, RAP, COUNTRY, POP;
}
public class Album {
    private String title;
    private String artist;
    private int releaseYear;
    private genre genre;

    public Album(String title, String artist, int releaseYear){
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = null;
    }
    public void setGenre(genre genre){
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public genre getGenre(){
        return genre;
    }
    @Override
    public String toString(){
        return "This album is " + this.title + " The artist is " + this.artist + "The release year was " + this.releaseYear +
                "The genre is " + this.genre;
    }
}
