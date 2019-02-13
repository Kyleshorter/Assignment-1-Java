import java.io.*;
import java.util.*;


public class Testing {
    public static void main(String[] args) throws IOException {

        Album alb = new Album("Thunderstruck", "ACDC", 1983);

        System.out.println(alb.toString());

        Scanner fin = new Scanner(new File("database.txt"));

        int count = 0;
        while (fin.hasNextLine()) {
            count = count + 1;
            fin.nextLine();
        }
        fin.close();
        System.out.println(count);

        String[] myArray = new String[count];
        Scanner fin1 = new Scanner(new File("database.txt"));
        for(int index=0; index < myArray.length; index ++) {
            myArray[index] = fin1.nextLine();


            //String[] splitArray;
           // splitArray = myArray[index].split("~");

           // System.out.println(splitArray[index] + " ");
            System.out.println(myArray[index]);

        }

    }
    }
