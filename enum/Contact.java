package enumexample;

enum PhoneType {
    CELL,
    HOME,
    WORK
}

public class Contact {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private PhoneType phoneType;

    public Contact(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = 0;
        this.phoneType = null;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean setPhoneNumber(String phoneNumber) {

        if (phoneNumber.matches("\\(\\d{3}\\)\\d{3}-?\\d{4}")) {
            String cleanedPhoneNumberString = phoneNumber.replaceAll("\\(|\\)|\\-", "");
            this.phoneNumber = Long.parseLong(cleanedPhoneNumberString);
            return true;
        } else {
            return false;
        }
    }

    public String getPhoneNumber() {

        String phoneNumber = Long.toString(this.phoneNumber);

        String areaCode = phoneNumber.substring(0, 3);
        String prefix = phoneNumber.substring(3, 6);
        String suffix = phoneNumber.substring(6, 10);

        return "(" + areaCode + ")" + prefix + "-" + suffix;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + getPhoneType() + ": " + getPhoneNumber();
    }
}
