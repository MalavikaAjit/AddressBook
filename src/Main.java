import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Scanner scan = new Scanner(System.in);
    public ArrayList<Contact> contactList = new ArrayList<>();
    //adding contacts
    public void addContact(Scanner scan) {
        System.out.println("Add Details ");
        System.out.println("Enter First Name");
        String first = scan.nextLine();
        System.out.println("Enter Last Name");
        String last = scan.nextLine();
        System.out.println("Enter Address");
        String address = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
        System.out.println("Enter Zip Code");
        int zip = scan.nextInt();
        System.out.println("Enter Phone Number");
        long mobileNo = scan.nextLong();
        System.out.println("Enter E-mail");
        String email = scan.next();
        Contact contact = new Contact(first, last, address, city, state, email, mobileNo, zip);
        contactList.add(contact);
        System.out.println("Contact added Successfully");
    }
    //displaying contacts
    public void displayContact() {
        System.out.println("Contact Details :");
        for (Contact person : contactList) {
            System.out.println(person.toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To The Address Book Problem");
        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        boolean loop=true;
        while (loop) {
            System.out.println("Enter an option");
            System.out.println("Options are\n"
                    + "1.Add contact\n"
                    + "2.Display contact\n"
                    + "3.Exit\n");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    main.addContact(scan);
                    break;
                case 2:
                    main.displayContact();
                    break;
                case 3:
                    System.out.println("Exit");
                    loop = false;
                    break;
            }
        }
    }
}









