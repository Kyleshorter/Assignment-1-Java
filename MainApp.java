public class MainApp {
    private static ArrayList<Album> albumCollection = new ArrayList<Album>();
    public static void main(String[] args) {

        Album alb = new Album("Thunderstruck", "ACDC", 1983);

        System.out.println(alb.toString());
        readFile();
       // System.out.println(albumCollection)

        }


private static void readFile(){
    File file = new File("database.txt");
    try{
        Scanner scanner = new Scanner(file);
        while (scanner.nextLine()) {
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String title = arr[0];
            String art = arr[1];
            int year = Integer.parseInt(arr[2]);
            genre gen = genre.values()[Integer.parseInt(arr[3])];
            Album a = new Album(title, art, year);
            albumCollection.add(a);
        }
    } catch (Exception ex) {
        System.out.println("Exception" + ex);
    }
}
}
