package address.data;
import address.Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * An AddressBook functions as arraylist of address entries where we can perform operations on
 * @author Victor Ly
 * @since 1.0 Exercise 2
 */
public class AddressBook
{
    private ArrayList<AddressEntry> entryList;
    public static Scanner userInput = new Scanner(System.in);
    public static String userString;
    public static int userInt;


    public AddressBook()        { entryList = new ArrayList<>();}

    /**
     * Option (2) of Menu - Add an entry by having a user enter its parameters
     * @author Victor Ly
     * @since (2/25) Commit 875e9b14f35226ed1892c77a68070c72ad9de062
     */
    public void createEntry()
    {
        AddressEntry newEntry = new AddressEntry("tempFirstName", "", "", "", "", "",
                "", "");

        newEntry.setFirstName(Menu.prompt_FirstName());
        newEntry.setLastName(Menu.prompt_LastName());
        newEntry.setStreet(Menu.prompt_Street());
        newEntry.setCity(Menu.prompt_City());
        newEntry.setState(Menu.prompt_State());
        newEntry.setZip(Menu.prompt_Zip());
        newEntry.setTelephone(Menu.prompt_Telephone());
        newEntry.setEmail(Menu.prompt_Email());

        entryList.add(newEntry);
    }

    /**
     * Simple helper function to add an existing addressEntry into the entryList arraylist
     * @author Victor Ly
     * @since 1.0 Exercise 2
     */
    public void addEntry(AddressEntry entry)
    {
        entryList.add(entry);
    }

    /**
     * Option (3) of Menu - Remove an entry by first searching then selecting the contact to remove
     * @author Victor Ly
     * @since (2/25) tba
     */
    public void removeEntry()
    {
        String searchStr = Menu.prompt_LastName();
        ArrayList<Integer> matchedIndex = new ArrayList<Integer>();
        int count = 1;

        System.out.println("\nIf available, select the entry number to remove: ");
        for (int index = 0; index < entryList.size(); index++)
        {
            if (entryList.get(index).getLastName().toUpperCase().contains(searchStr.toUpperCase()))
            {
                System.out.println("\n" + count + ". ");
                count++;
                System.out.print(entryList.get(index));
                matchedIndex.add(index);
                System.out.println("");
            }
        }

        userInt = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Hit 'y' to remove the following entry or 'n' to return to the main menu: ");
        System.out.println("\n" + entryList.get(matchedIndex.get(userInt - 1)));

        userString = userInput.nextLine();

        if (userString.equals("y"))
        {
            entryList.remove(entryList.get(matchedIndex.get(userInt - 1)));
        }

    }




    /**
     * Simple helper function to remove an existing addressEntry from the entryList arraylist
     * @author Victor Ly
     * @since 1.0 Exercise 2
     */
    public void removeEntry(AddressEntry entry)
    {
        entryList.remove(entry);
    }

    /**
     * Print function for entryList using 'for each' loop
     * @author Victor Ly
     * @since 1.0 Exercise 2
     */
    public void list()
    {
        for (AddressEntry entry: entryList)
        {
            System.out.println(entry);
        }
    }
}

