package address;


import address.data.AddressBook;
import address.data.AddressEntry;
import java.util.Scanner;


public class AddressBookApplication
{
    public static void initAddressBookExercise(AddressEntry entry1, AddressEntry entry2, AddressBook ab)
    {
        ab.addEntry(entry1);
        ab.addEntry(entry2);
        ab.list();
    }


    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int selection = 0;
        AddressBook ab = new AddressBook();
        String userString;
        int userInt;



        while (selection != 6)
        {
            Menu.displayMenu();
            selection = userInput.nextInt();
            userInput.nextLine();

            if (selection == 1)
            {
            }

            if (selection == 2)
            {
                ab.createEntry();
            }

            if (selection == 3)
            {
            }

            if (selection == 4)
            {
            }

            if (selection == 5)
            {
            }

            if (selection == 6)
            {
                System.out.println("Exiting the program.");
            }

        }
    }
}

