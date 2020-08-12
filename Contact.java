import java.util.Optional;
import java.util.Scanner;
public class Contact{
    private String contactName;
    private String phoneNum;
    private String optEmail;
    private ContactAddress address;
    //private File contactPicture

    public Contact(String contactName, String phoneNum, String optEmail, ContactAddress address) {
        this.contactName = contactName;
        this.phoneNum = phoneNum;
        this.optEmail = optEmail;
        this.address = address;
    }
    //Create a contact without optional email or address
    public Contact(String contactName, String phoneNum) {
        this.contactName = contactName;
        this.phoneNum = phoneNum;
    }
    public Contact(String contactName, String phoneNum, String optEmail) {
        this.contactName = contactName;
        this.phoneNum = phoneNum;
        this.optEmail = optEmail;
    }

    public Contact(String contactName, ContactAddress address, String phoneNum) {
        this.contactName = contactName;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public Contact() {
        this(null, null, null, null);
    }
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        /**Scanner setContactName = new Scanner(System.in);
        System.out.println("Name:");*/
        contactName = contactName;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(String number) {
        /**Scanner scan = new Scanner(System.in);
        System.out.print("Number:");
        String value = scan.next();*/
        phoneNum = number;
    }

    public String getOptEmail() {
        return optEmail;
    }

    public void setOptEmail(String optEmail) {
        /**Scanner scan = new Scanner(System.in);
        System.out.print("Email:");*/
        this.optEmail = optEmail;
    }

    public ContactAddress getAddress() {
        return address;
    }
    public void setAddress(ContactAddress address) {
        this.address = address;
    }

    public String toString() {
        if(optEmail == null && address == null) {
            return "Name: " + contactName + "\nPhone Number: " + phoneNum;
        }
        if(optEmail == null) {
            return "Name: " + contactName + "\nPhone Number: " + phoneNum + "\nAddress: " + address.toString();
        }
        return "Name: " + contactName + "\nPhone Number: " + phoneNum + " \nEmail: " + optEmail + "\nAddress: " + address.toString();

    }

}
