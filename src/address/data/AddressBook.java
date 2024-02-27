package address.data;
import address.Menu;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * An AddressBook functions as arraylist of address entries where we can perform operations on
 * @author Victor Ly
 * @since 1.0 Exercise 2
 */
public class AddressBook
{
    public ArrayList<AddressEntry> entryList;
    public static Scanner userInput = new Scanner(System.in);
    public static String userString;
    public static int userInt;

    public AddressBook()        { entryList = new ArrayList<>();}

    /**
     * Option (b) of Menu - Add an entry by having a user enter its parameters
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
     * Option (c) of Menu - Remove an entry by first searching then selecting the contact to remove
     * @author Victor Ly
     * @since (2/26) Commit d483d0399b9b7fb26afd14f86ca263d38eee3325
     */
    public void removeEntry()
    {
        String searchStr = Menu.prompt_LastName();
        ArrayList<Integer> matchedIndex = new ArrayList<>();
        int count = 1;

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
        if (count == 1)
        {
            System.out.println("No contact was found with that last name.");
            return;
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
     * Option (a) of Menu - Load in contacts from a text
     * @author Victor Ly
     * @throws IOException FileStream
     * @since (2/26) Commit 577bde5efdac6f2902a05621e6a222e125c7e8f3
     */
    public void loadFromFile() throws IOException
    {
        String firstName, lastName, street, city, state, zip, telephone, email;
        boolean isSuccessful = false;

        while (!isSuccessful)
        {
            try
            {
                System.out.println("Enter file name: ");
                userString = userInput.nextLine();

                FileReader file_input = new FileReader(userString);
                BufferedReader BR = new BufferedReader(file_input);

                while (BR.readLine() != null)
                {
                    firstName = BR.readLine();
                    lastName = BR.readLine();
                    street = BR.readLine();
                    city = BR.readLine();
                    state = BR.readLine();
                    zip = BR.readLine();
                    telephone = BR.readLine();
                    email = BR.readLine();

                    AddressEntry newEntry  = new AddressEntry(firstName, lastName, street, city, state, zip, telephone, email);
                    addEntry(newEntry);
                }
                isSuccessful = true;
            }

            catch (Exception e)
            {
                System.out.println("Error: File does not exist. Try again");
                isSuccessful = false;
            }
        }
    }

    /**
     * Option (d) of Menu - Searches and displays all contacts with the last name prompted from user
     * @author Victor Ly
     * @since (2/26) Commit 10108d52deee66c1abe71d81ff6c431b582de9a7
     */
    public void findContact()
    {
        String searchStr = Menu.prompt_LastName();
        int count = 1;

        for (AddressEntry addressEntry : entryList)
        {
            if (addressEntry.getLastName().toUpperCase().contains(searchStr.toUpperCase()))
            {
                System.out.println("\n" + count + ". ");
                count++;
                System.out.print(addressEntry);
            }
        }
    }

    /**
     * Option (e) of Menu - Lists all contacts in alphabetical order
     * @author Victor Ly
     * @since Commit 7fd91a55631c38f08a9c598b6f2fd3090244a625
     */
    public void listContacts()
    {
        ArrayList<AddressEntry> entryListClone;
        entryListClone = (ArrayList<AddressEntry>) entryList.clone();

        entryListClone.sort(Comparator.comparing(AddressEntry::getLastName));

        for (AddressEntry entry : entryListClone)       {System.out.print(entry);}
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

