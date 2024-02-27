package address;


import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * AddressBookApplication serves as the main() method where the menu is initialized
 * @author Victor Ly
 * @since 1.0 Exercise 2
 */
public class AddressBookApplication
{
    public static void initAddressBookExercise(AddressEntry entry1, AddressEntry entry2, AddressBook ab)
    {
        ab.addEntry(entry1);
        ab.addEntry(entry2);
        ab.list();
    }


    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        String selection = "";
        AddressBook ab = new AddressBook();
        String userString;
        int userInt;

        while (!selection.equals("f"))
        {
            Menu.displayMenu();
            selection = userInput.nextLine();

            if (selection.equals("a"))      {ab.loadFromFile();}

            if (selection.equals("b"))      {ab.createEntry();}

            if (selection.equals("c"))      {ab.removeEntry();}

            if (selection.equals("d"))      {ab.findContact();}

            if (selection.equals("e"))      {ab.listContacts();}

            if (selection.equals("f"))       {System.out.println("Exiting the program.");}

        }
    }
}

