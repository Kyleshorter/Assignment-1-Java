import java.util.*;
import java.io.*;

public class MainApp {

    static ArrayList<Album> albumCollection = new ArrayList<Album>();

    public static void main(String[] args) throws FileNotFoundException {

        //Album alb = new Album("thunderstruck", "ac/dc", 1983);
        //System.out.print(alb.toString());

        File inputFile = new File("database.txt");
        Scanner fin = new Scanner(inputFile);
        while (fin.hasNextLine()) {
            String line = fin.nextLine();
            Album album = new Album(line);
            album.title = line;
            albumCollection.add(album);
            System.out.println(album.title);



            }
        }
    }
