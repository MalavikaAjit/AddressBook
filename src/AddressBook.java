public class AddressBook {
    public String bookName;

    public AddressBook(String userInputBookName)
    {
        this.bookName = userInputBookName;
    }
    public String getBookName()
    {
        return bookName;
    }
    public void setBookName(String firstName)
    {
        this.bookName = bookName;
    }
    public String toString()
    {
        return "AddressBookName:" + bookName + "\n";
    }
}
