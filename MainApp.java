import java.util.*;
import java.io.*;

/**
 * This code takes the albums from a file and stores it into an array. It allows you to display, add, search, delete,
 * and close the program.
 *
 * @author Kyle Shorter
 * Feburary 11, 2019
 */
public class MainApp {
    private static ArrayList<Album> albumCollection = new ArrayList<Album>();
    public static void main(String[] args)throws IOException {
        readFile();

        Scanner input = new Scanner(System.in);
        System.out.println("1. Display list of all albums in the collection");
        System.out.println("2. Add a new album to the collection");
        System.out.println("3. Search for an album given the name of the artist or title, or part of the album or name");
        System.out.println("4. Delete an album from the collection");
        System.out.println("5. Exit Program");
       while(true) {
           int choice = input.nextInt();

           if (choice == 1) {
               System.out.println(albumCollection.toString());
               System.out.println("Returning to main menu.");
           } else if (choice == 2) {
               add();
               System.out.println("Returning to main menu.");
           }
           else if( choice == 3){
               search();
               System.out.println("Returning to main menu.");
           }
           else if ( choice == 4){
               delete();
               System.out.println("Returning to main menu.");
           } else if (choice == 5) {
               FileWriter writer = new FileWriter("database.txt");
               for(Album a : albumCollection)
               {
                   StringBuilder create = new StringBuilder();
                   create.append(a.Title);
                   create.append("~");
                   create.append(a.artist);
                   create.append("~");
                   create.append(a.releaseYear);
                   create.append("~");
                   create.append(a.genre.ordinal());
                   create.append("\n");
                   writer.write(create.toString());
               }
               writer.close();
               System.exit(0);
           }
       }
    }

    /**
     * This method reads in the file and allows it to store it into an array list.
     */
    private static void readFile(){
        File file = new File("database.txt");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split("~");
                String art = arr[0];
                String title = arr[1];
                int year = Integer.parseInt(arr[2]);
                genre gen = genre.values()[Integer.parseInt(arr[3])];
                Album a = new Album(title, art, year, gen);
                albumCollection.add(a);
            }
        } catch (Exception ex) {

        System.out.println("Exception" + ex);
    }
}
    /**
     * This method allows the user to add things into the array.
     */
    private static void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = input.nextLine();
        System.out.println("Enter the artist: ");
        String art = input.nextLine();
        System.out.println("Enter the release year: ");
        int relyr = input.nextInt();
        if(relyr <= 1800) {
            System.out.println("Invalid year");
            System.exit(0);
        }
        System.out.println("Enter the Genre: 1-RAP, 2- ROCK, 3- COUNTRY, 4- POP: ");
        int genreInput=0;
        genreInput = input.nextInt();
        if(genreInput == 1){
             genre gen = genre.RAP;
             Album a = new Album(title, art, relyr, gen);
             albumCollection.add(a);
        }
        else if(genreInput == 2){
             genre gen = genre.ROCK;
             Album a = new Album(title, art, relyr, gen);
             albumCollection.add(a);
        }
        else if (genreInput == 3){
             genre gen = genre.COUNTRY;
             Album a = new Album(title, art, relyr, gen);
             albumCollection.add(a);
        }
        else if (genreInput == 4){
             genre gen = genre.POP;
             Album a = new Album(title, art, relyr, gen);
             albumCollection.add(a);
        }
        else{
            System.out.println("Error: invalid input");
            System.exit(0);
        }
}
    /**
     * This method allows the user to search the array.
     */
    private static void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Title or Artist you'd like to search: ");
        String userinput = scan.nextLine();
        for(Album a: albumCollection){
            String search = a.getArtist()+a.getTitle();
            if(search.contains(userinput)){
                System.out.println(a.toString());
            }
        }
}
    /**
     * This method allows the user to delete albums in the array.
     */
    private static void delete(){
        System.out.println("Enter an album to delete using numbers: 1-deletes the first album, 2- deletes the second" +
                "album, etc... ");
        Scanner input = new Scanner(System.in);
        int use = input.nextInt();
        if( use == 1) {
            albumCollection.remove(0);
        }else if( use == 2){
            albumCollection.remove(1);
        }else if( use == 3){
            albumCollection.remove(2);
        }else if( use == 4){
            albumCollection.remove(3);
        }else if( use == 5){
            albumCollection.remove(4);
        }else if( use == 6){
            albumCollection.remove(5);
        }else if( use == 7){
            albumCollection.remove(6);
        }else if( use == 8){
            albumCollection.remove(7);
        }else if( use == 9){
            albumCollection.remove(8);
        }else if( use == 10){
            albumCollection.remove(9);
        }
        System.out.println("Delete Successful.");
}
}
