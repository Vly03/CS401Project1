package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest
{
    AddressEntry entry1 = new AddressEntry("Bill", "Gates", "Manhattan", "Seattle", "CA", "95156",
            "(408)562-9368", "billgates@yahoo.com");

    AddressEntry entry2 = new AddressEntry("Ryan", "Reynolds", "Sunset Boulevard", "Austin", "TX", "95762",
            "(408)782-2349", "ryanrenolds@gmail.com");

    @Test
    void getFirstName()
    {
        assertEquals("Bill",entry1.getFirstName());
        assertEquals("Ryan",entry2.getFirstName());
    }

    @Test
    void getLastName()
    {
        assertEquals("Gates",entry1.getLastName());
        assertEquals("Reynolds",entry2.getLastName());
    }

    @Test
    void getStreet()
    {
        assertEquals("Manhattan",entry1.getStreet());
        assertEquals("Sunset Boulevard",entry2.getStreet());
    }

    @Test
    void getCity()
    {
        assertEquals("Seattle",entry1.getCity());
        assertEquals("Austin",entry2.getCity());
    }

    @Test
    void getState()
    {
        assertEquals("CA",entry1.getState());
        assertEquals("TX",entry2.getState());
    }

    @Test
    void getZip()
    {
        assertEquals("95156",entry1.getZip());
        assertEquals("95762",entry2.getZip());
    }

    @Test
    void getTelephone()
    {
        assertEquals("(408)562-9368",entry1.getTelephone());
        assertEquals("(408)782-2349",entry2.getTelephone());
    }

    @Test
    void getEmail()
    {
        assertEquals("billgates@yahoo.com",entry1.getEmail());
        assertEquals("ryanrenolds@gmail.com",entry2.getEmail());
    }

    @Test
    void setFirstName()
    {
        entry1.setFirstName("Tim");
        assertEquals("Tim",entry1.getFirstName());

        entry2.setFirstName("Jake");
        assertEquals("Jake",entry2.getFirstName());
    }

    @Test
    void setLastName()
    {
        entry1.setLastName("Cook");
        assertEquals("Cook",entry1.getLastName());

        entry2.setLastName("Musk");
        assertEquals("Musk",entry2.getLastName());
    }

    @Test
    void setStreet()
    {
        entry1.setStreet("Moonstone");
        assertEquals("Moonstone",entry1.getStreet());

        entry2.setStreet("Harp");
        assertEquals("Harp",entry2.getStreet());
    }

    @Test
    void setCity()
    {
        entry1.setCity("Dallas");
        assertEquals("Dallas",entry1.getCity());

        entry2.setCity("San Diego");
        assertEquals("San Diego",entry2.getCity());
    }

    @Test
    void setState()
    {
        entry1.setState("GA");
        assertEquals("GA",entry1.getState());

        entry2.setState("NY");
        assertEquals("NY",entry2.getState());
    }

    @Test
    void setZip()
    {
        entry1.setZip("95292");
        assertEquals("95292",entry1.getZip());

        entry2.setZip("95023");
        assertEquals("95023",entry2.getZip());
    }

    @Test
    void setTelephone()
    {
        entry1.setTelephone("4824823823");
        assertEquals("4824823823",entry1.getTelephone());

        entry2.setTelephone("3814834823");
        assertEquals("3814834823",entry2.getTelephone());
    }

    @Test
    void setEmail()
    {
        entry1.setEmail("holdemail@gmail.com");
        assertEquals("holdemail@gmail.com",entry1.getEmail());

        entry2.setEmail("testeremail@yahoo.com");
        assertEquals("testeremail@yahoo.com",entry2.getEmail());
    }
}