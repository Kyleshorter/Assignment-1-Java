import java.util.*;
import java.io.*;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Album alb= new Album("thunderstruck", "ac/dc", 1983);
        System.out.print(alb.toString());

        File inputFile = new File("database.txt");
        Scanner fin = new Scanner(inputFile);

    }
}
