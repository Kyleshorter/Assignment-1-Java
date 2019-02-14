import java.util.*;
import java.io.*;


public class MainApp {
    private static ArrayList<Album> albumCollection = new ArrayList<Album>();
    public static void main(String[] args) {
        //Album alb = new Album("Thunderstruck", "ACDC", 1983, genre.ROCK);
        //System.out.println(alb.toString());
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
           } else if (choice == 2) {
               add();
           } else if (choice == 5) {
               System.exit(0);
           }
       }
    }


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
private static void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = input.nextLine();
        System.out.println("Enter the artist: ");
        String art = input.nextLine();
        System.out.println("Enter the release year: ");
        int relyr = input.nextInt();
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
        }
}
}
