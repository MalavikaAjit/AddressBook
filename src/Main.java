import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Scanner scan = new Scanner(System.in);
    public ArrayList<Contact> contactList = new ArrayList<>();
    ArrayList<AddressBook> addressBookList = new ArrayList<>();
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
    public void editContact(Scanner scan) {
        System.out.println("Enter contact name to edit ");
        String contactName = scan.next();
        boolean found = false;
        for (Contact person : contactList) {
            System.out.println(person.toString());
            if (contactName.equalsIgnoreCase(person.firstName)) {
                found=true;

                System.out.println("Enter choice to edit\n"
                        + "1.Edit last name\n"
                        + "2. Edit email\n"
                        + "3.Edit Mobile No.\n"
                        + "4.Edit State\n"
                        + "5.Edit city\n"
                        + "6.Edit zip code\n"
                        + "7.Edit address\n");
                int choice2 = scan.nextInt();
                scan.nextLine();
                //------------------
                switch (choice2) {
                    case 1: {
                        System.out.println("Enter Last Name \n");
                        String last = scan.nextLine();
                        person.setLastName(last);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter email");
                        String email = scan.nextLine();
                        person.setEmail(email);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Mobile no");
                        long mobileNo = scan.nextLong();
                        //Use nextLine() even after taking long input
                        scan.nextLine();
                        person.setMobileNo(mobileNo);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter State");
                        String state = scan.nextLine();
                        person.setState(state);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter city");
                        String city = scan.nextLine();
                        person.setCity(city);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter zip code");
                        int zip = scan.nextInt();
                        scan.nextLine();
                        person.setZip(zip);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Address");
                        String address = scan.nextLine();
                        person.setCity(address);
                        break;
                    }
                    default:System.out.println("exit");
                }

            }
            if (found)
                break;
        }
        if (!found)
            System.out.println("No such contact");
    }
    public void displayContact() {
        System.out.println("Contact Details :");
        for (Contact person : contactList) {
            System.out.println(person.toString());
        }
    }
    public void deleteContact(Scanner scan) {
        System.out.println("enter First name to delete details:");
        String name = scan.nextLine();

        for (int i=0; i < contactList.size(); i++)
        {
            String personName = contactList.get(i).firstName;

            if (name.equals(personName))
            {
                contactList.remove(i);
                System.out.println("this person details is deleted");
                break;
            }
            else
                System.out.println("please enter valid name");
        }
    }
    public void addAddressBook(Scanner scan)
    {
        System.out.println("Enter AddressBook Name");
        String bookName = scan.next();
        AddressBook addressbook = new AddressBook(bookName);
        addressBookList.add(addressbook);
    }
    public void displayAddressBook()
    {
        System.out.println("AddressBook Names are : ");

        for (AddressBook addressBookList : addressBookList) {
            System.out.println(addressBookList);
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
                    + "2.Edit contact\n"
                    + "3.Display contact\n"
                    + "4.Remove contact\n"
                    + "5.Add Address book\n"
                    + "6.Display Address book\n"
                    + "7.Exit\n");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    main.addContact(scan);
                    break;
                case 2:
                    main.editContact(scan);
                    break;
                case 3:
                    main.displayContact();
                    break;
                case 4:
                    main.deleteContact(scan);
                    break;
                case 5:
                    main.addAddressBook(scan);
                    break;
                case 6:
                    main.displayAddressBook();
                    break;
                case 7:
                    System.out.println("Exit");
                    loop = false;
                    break;
            }
        }
    }
}







