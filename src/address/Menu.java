package address;
import java.io.*;
import java.util.Scanner;

/**
 * Menu functions as a pseudo helper class to AddressBookApplication that generates and displays the console that the user sees
 * @author Victor Ly
 * @since 1.0 Exercise 2
 */
public class Menu
{
    public static Scanner userInput = new Scanner(System.in);
    public static String userString;
    public static int userInt;

    /**
     * Displays Options (1-6) to the user
     * @author Victor Ly
     * @since (2/24) Commit 2640e6d19b84517aebc3361d89bfebe59119e433
     */
    public static void displayMenu()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Enter a menu selection:");
        System.out.println("a. Loading from file");
        System.out.println("b. Addition");
        System.out.println("c. Removal");
        System.out.println("d. Find");
        System.out.println("e. Listing");
        System.out.println("f. Quit");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    /**
     * Helper function for user input correctness that determines if a string contains an integer
     * @author Victor Ly
     * @param str String from user input
     * @return boolean True -> Contains integer, False --> No integer
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static boolean ifContainsInt(String str)
    {
        for (int i = 0; i < str.length(); i++ )
        {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                return true;
        }
        return false;
    }

    /**
     * Helper function for user input correctness that determines if a string contains a letter
     * @author Victor Ly
     * @param str String from user input
     * @return True -> Contains a letter, False --> No letters
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static boolean ifContainsLetters(String str)
    {
        for (int i = 0; i < str.length(); i++ )
        {
            if (str.charAt(i) < 48 || str.charAt(i) > 57)
                return true;
        }
        return false;
    }

    /**
     * Prompts user for a first name, updated with user input correctness i.e. no numbers allowed in a name
     * @author Victor Ly
     * @return String firstName
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_FirstName()
    {
        boolean invalidInput;

        System.out.println("First name: ");
        userString = userInput.nextLine();

        if (ifContainsInt(userString))
        {
            System.out.println("Invalid! Contains an integer. Try again");
            prompt_FirstName();
        }
        return userString;
    }

    /**
     * Prompts user for a last name, updated with user input correctness i.e. no numbers allowed in a name
     * @author Victor Ly
     * @return String lastName
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_LastName()
    {
        boolean invalidInput;

        System.out.println("Last name: ");
        userString = userInput.nextLine();

        if (ifContainsInt(userString))
        {
            System.out.println("Invalid! Contains an integer. Try again");
            prompt_LastName();
        }
        return userString;
    }

    /**
     * Prompts user for a street, both letters and numbers are allowed in a street
     * @author Victor Ly
     * @return String street
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_Street()
    {
        System.out.println("Street: ");
        userString = userInput.nextLine();
        return userString;
    }

    /**
     * Prompts user for city, updated with user input correctness i.e. no numbers allowed in a city name
     * @author Victor Ly
     * @return String city
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_City()
    {
        boolean invalidInput;

        System.out.println("City: ");
        userString = userInput.nextLine();

        if (ifContainsInt(userString))
        {
            System.out.println("Invalid! Contains an integer. Try again");
            prompt_City();
        }
        return userString;
    }

    /**
     * Prompts user for state, updated with user input correctness i.e. no numbers allowed in a state name
     * @author Victor Ly
     * @return String state
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_State()
    {
        boolean invalidInput;

        System.out.println("State: ");
        userString = userInput.nextLine();

        if (ifContainsInt(userString))
        {
            System.out.println("Invalid! Contains an integer. Try again");
            prompt_State();
        }
        return userString;
    }

    /**
     * Prompts user for zip, updated with user input correctness i.e. no letters allowed in a zip
     * @author Victor Ly
     * @return String zip
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_Zip()
    {
        boolean invalidInput;

        System.out.println("Zip: ");
        userString = userInput.nextLine();

        if (ifContainsLetters(userString))
        {
            System.out.println("Invalid! Contains a letter. Try again");
            prompt_Zip();
        }
        return userString;
    }

    /**
     * Prompts user for phone, updated with user input correctness i.e. no letters allowed in a phone number
     * @author Victor Ly
     * @return String telephone
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_Telephone()
    {
        boolean invalidInput;

        System.out.println("Telephone: ");
        userString = userInput.nextLine();

        if (ifContainsLetters(userString))
        {
            System.out.println("Invalid! Contains a letter. Try again");
            prompt_Telephone();
        }
        return userString;
    }

    /**
     * Prompts user for email, both numbers and letters allowed in a valid email address
     * @author Victor Ly
     * @return String email
     * @since (2/25) Commit 1af2ae19464a6d5da0a4385f95aad68b0dfe4029
     */
    public static String prompt_Email()
    {
        System.out.println("Email: ");
        userString = userInput.nextLine();
        return userString;
    }
}

