
enum genre {
    RAP, ROCK, COUNTRY, POP
}
public class Album {

    public String Title;
    public String artist;
    public int releaseYear;
    public genre genre;

    public Album(String Title, String artist, int releaseYear) {
        this.Title = Title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = null;
    }

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return artist;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public genre getGenre() {
        return genre;
    }
    public String toString() {
        return "Your title" + Title + " artist" + artist + " ReleaseYear " + releaseYear + "Genre" + genre;
    }
}
