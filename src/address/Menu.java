package address;
import java.io.*;
import java.util.Scanner;

public class Menu
{
    public static Scanner userInput = new Scanner(System.in);
    public static String userString;
    public static int userInt;

    public static void displayMenu()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Enter a menu selection:");
        System.out.println("1. Loading from file");
        System.out.println("2. Addition");
        System.out.println("3. Removal");
        System.out.println("4. Find");
        System.out.println("5. Listing");
        System.out.println("6. Quit");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static boolean ifContainsInt(String str)
    {
        for (int i = 0; i < str.length(); i++ )
        {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                return true;
        }
        return false;
    }

    public static boolean ifContainsLetters(String str)
    {
        for (int i = 0; i < str.length(); i++ )
        {
            if (str.charAt(i) < 48 || str.charAt(i) > 57)
                return true;
        }
        return false;
    }

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
    public static String prompt_Street()
    {
        System.out.println("Street: ");
        userString = userInput.nextLine();
        return userString;
    }

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

    public static String prompt_Email()
    {
        System.out.println("Email: ");
        userString = userInput.nextLine();
        return userString;
    }
}



