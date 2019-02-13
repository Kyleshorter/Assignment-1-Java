import java.util.*;
import java.io.*;


public class MainApp {

    private static ArrayList<Album> albumCollection = new ArrayList<Album>();
    private static final String DATABASE_FILE = "database.txt";

    public static void main(String[] args) throws FileNotFoundException {


        //Album alb = new Album("thunderstruck", "ac/dc", 1983);
        //System.out.print(alb.toString());
        fileRead();
        //System.out.println("1. Display list of all albums in the collection");
       // System.out.println("2. Add a new album to the collection");
       // System.out.println("3. Search for an album given the name of the artist or titleof the album or part of the name of the artist or title of the album ");
      //  System.out.println("4. Delete an album from the collection");
      //  System.out.println("5. Exit Program");
      //  Scanner sc = new Scanner(System.in);
        while (true) {
           // Scanner fin = new Scanner(DATABASE_FILE);
            //int input = sc.nextInt();

        }
    }

    private static void fileRead() {

        File file = new File(DATABASE_FILE);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] album = line.split("~");
                System.out.print(album.toString());


            }
        }catch(Exception ex) {

            System.out.println("Exception: " + ex);
        }
    }
}
