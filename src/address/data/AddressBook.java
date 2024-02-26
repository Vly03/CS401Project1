package address.data;
import address.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
    private ArrayList<AddressEntry> entryList;
    public static Scanner userInput = new Scanner(System.in);
    public static String userString;
    public static int userInt;


    public AddressBook()        { entryList = new ArrayList<>();}


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

    public void addEntry(AddressEntry entry)
    {
        entryList.add(entry);
    }


    public void removeEntry(AddressEntry entry)
    {
        entryList.remove(entry);
    }


    public void list()
    {
        for (AddressEntry entry: entryList)
        {
            System.out.println(entry);
        }
    }

}

