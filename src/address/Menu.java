package address;

public class Menu
{
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

    public static String prompt_FirstName()     {return "First Name:";}

    public static String prompt_LastName()      {return "Last Name:";}
    public static String prompt_Street()        {return "Street:";}

    public static String prompt_City()          {return "City: ";}
    public static String prompt_State()         {return "State: ";}
    public static String prompt_Zip()           {return "Zip: ";}
    public static String prompt_Telephone()     {return "Telephone: ";}
    public static String prompt_Email()         {return "Email:";}
}



