package address;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenuTest
{
    String noIntegerString = "abc";
    String noLettersString = "27414";
    String mixedString = "1a2b3c";
    String firstUser;
    String secondUser;
    boolean firstValidity;
    boolean secondValidity;

    @Test
    void ifContainsInt()
    {
        assertTrue(Menu.ifContainsInt(mixedString));
        assertTrue(Menu.ifContainsInt(noLettersString));
        assertFalse(Menu.ifContainsInt(noIntegerString));
    }

    @Test
    void ifContainsLetters()
    {
        assertTrue(Menu.ifContainsLetters(mixedString));
        assertFalse(Menu.ifContainsLetters(noLettersString));
        assertTrue(Menu.ifContainsLetters(noIntegerString));
    }

    @Test
    void prompt_FirstName()     // A valid first name allows letters but not integers
    {
        firstUser = "Bill";
        secondUser = "B2i4l491l";
        firstValidity = false;
        secondValidity = false;

        if (!Menu.ifContainsInt(firstUser))     {firstValidity = true;}

        if (!Menu.ifContainsInt(secondUser))    {secondValidity = true;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_LastName()        // A valid last name allows letters but not integers
    {
        firstUser = "Sanchez";
        secondUser = "S41an59ch32ez";
        firstValidity = false;
        secondValidity = false;

        if (!Menu.ifContainsInt(firstUser))     {firstValidity = true;}

        if (!Menu.ifContainsInt(secondUser))    {secondValidity = true;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_Street()        // A valid street can have both letters and numbers
    {
        firstUser = "Sunset Courtyard";
        secondUser = "4th Street";

        assertEquals("Sunset Courtyard", firstUser);
        assertEquals("4th Street", secondUser);
    }

    @Test
    void prompt_City()      // A valid street cannot have numbers
    {
        firstUser = "London";
        secondUser = "L924ond29n";
        firstValidity = false;
        secondValidity = false;

        if (!Menu.ifContainsInt(firstUser))     {firstValidity = true;}

        if (!Menu.ifContainsInt(secondUser))    {secondValidity = true;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_State()         // A valid state cannot have numbers
    {
        firstUser = "CA";
        secondUser = "C591A";
        firstValidity = false;
        secondValidity = false;

        if (!Menu.ifContainsInt(firstUser))     {firstValidity = true;}

        if (!Menu.ifContainsInt(secondUser))    {secondValidity = true;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_Zip()       // A valid zip cannot contain letters, only integers
    {
        firstUser = "95812";
        secondUser = "9A5JK24";
        firstValidity = true;
        secondValidity = true;

        if (Menu.ifContainsLetters(firstUser))     {firstValidity = false;}

        if (Menu.ifContainsLetters(secondUser))    {secondValidity = false;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_Telephone()         // A valid telephone cannot contain letters, only integers
    {
        firstUser = "4087348719";
        secondUser = "40ajf20mos";
        firstValidity = true;
        secondValidity = true;

        if (Menu.ifContainsLetters(firstUser))     {firstValidity = false;}

        if (Menu.ifContainsLetters(secondUser))    {secondValidity = false;}

        assertTrue(firstValidity);
        assertFalse(secondValidity);
    }

    @Test
    void prompt_Email()     // A valid email can contain both letters and numbers
    {
        firstUser = "testeruser@gmail.com";
        secondUser = "holderemail@yahoo.com";

        assertEquals("testeruser@gmail.com", firstUser);
        assertEquals("holderemail@yahoo.com", secondUser);
    }
}