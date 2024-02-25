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
        AddressBook ab = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Bill", "Gates", "Manhattan", "Seattle", "CA", 95162,
                "(408)562-9368", "billgates@yahoo.com");


        AddressEntry entry2 = new AddressEntry("Ryan", "Renolds", "Sunset Boulevard", "Austin", "TX", 95762,
                "(408)782-2349", "ryanrenolds@gmail.com");


        // initAddressBookExercise(entry1, entry2, ab);
        //ab.addEntry(entry1);
    }
}

