import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    HashMap<String, AddressBook> addressBookLists = new HashMap<>();
    private String bookName;
    //Scanner scan = new Scanner(System.in);
   //add new address book to the addressBook list
    public void addAddressBook(Scanner scan) {
        System.out.println("Enter AddressBook Name");
        String bookName = scan.nextLine();
        while (addressBookLists.containsKey(bookName)) {
            System.out.println("The Name already exist");
            bookName = scan.nextLine();
        }
        addressBookLists.put(bookName, new AddressBook());

    }
    //options for the user to select
    public void accessOptions(Scanner scan) {
        AddressBook obj = new AddressBook();

        boolean loop = true;
        while (loop) {

            System.out.println("Enter an option");
            System.out.println("Options are\n"
                    + "1.Add new AddressBook\n"
                    + "2.Add contact\n"
                    + "3.Edit contact\n"
                    + "4.Display contact\n"
                    + "5.Remove contact\n"
                    + "6.Exit\n");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    addAddressBook(scan);
                    break;
                case 2:
                    obj.addContact(scan);
                    break;
                case 3:
                    obj.editContact(scan);
                    break;
                case 4:
                    obj.displayContact();
                    break;
                case 5:
                    obj.deleteContact(scan);
                    break;
                case 6:
                    System.out.println("Exit");
                    loop = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {

        Main main = new Main();
        System.out.println("Welcome To The Address Book Problem");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter address book name");
        String bookName=scan.next();
        main.addressBookLists.put(bookName, new AddressBook());
        main.accessOptions(scan);
    }
}





