package enumexample;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter Contact's Last Name: ");
        String lastName = in.nextLine();
        System.out.println("");

        System.out.print("Enter Contact's First Name: ");
        String firstName = in.nextLine();
        System.out.println("");

        Contact contact = new Contact(lastName, firstName);

        boolean isPhoneNumberSet = false;

        while (!isPhoneNumberSet) {

            System.out.print("Enter Contact's Phone Number in the format (123)456-7890: ");
            String phoneNumber = in.nextLine();
            System.out.println("");
            isPhoneNumberSet = contact.setPhoneNumber(phoneNumber);
        }

        System.out.println("Select the phone type:");
        System.out.println("1. Cell");
        System.out.println("2. Home");
        System.out.println("3. Work\n");

        int phoneTypeInt = in.nextInt();
        System.out.println("");

        switch (phoneTypeInt) {
            case 1:
                contact.setPhoneType(PhoneType.CELL);
                break;
            case 2:
                contact.setPhoneType(PhoneType.HOME);
                break;
            case 3:
                contact.setPhoneType(PhoneType.WORK);
                break;
            default:
                break;
        }

        System.out.println(contact.toString());
    }
}
