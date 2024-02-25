package address;


import address.data.AddressBook;
import address.data.AddressEntry;


public class AddressBookApplication
{
    public static void initAddressBookExercise(AddressEntry entry1, AddressEntry entry2, AddressBook ab)
    {
        ab.addEntry(entry1);
        ab.addEntry(entry2);
        ab.list();
    }


    public static void main(String args[])
    {
        Menu.displayMenu();
        AddressBook ab = new AddressBook();

    }
}

