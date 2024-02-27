package address.data;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest
{
    AddressBook ab = new AddressBook();

    @Test
    void createEntry()
    {
        AddressEntry newEntry1 = new AddressEntry("Clark", "Kent", "Sunset Boulevard", "Austin", "TX", "95762",
            "(408)782-2349", "cklent@gmail.com");

        AddressEntry newEntry2 = new AddressEntry("Bruce", "Wayne", "Oakwood Avenue", "Seattle", "WA", "92192",
                "(408)923-5232", "bwayne@gmail.com");

        ab.addEntry(newEntry1);
        ab.addEntry(newEntry2);

        assertEquals(newEntry1,ab.entryList.get(0));
        assertEquals(newEntry2, ab.entryList.get(1));
    }

    @Test
    void removeEntry()
    {
        AddressEntry newEntry1 = new AddressEntry("Clark", "Kent", "Sunset Boulevard", "Austin", "TX", "95762",
                "(408)782-2349", "cklent@gmail.com");

        AddressEntry newEntry2 = new AddressEntry("Bruce", "Wayne", "Oakwood Avenue", "Seattle", "WA", "92192",
                "(612)923-5232", "bwayne@gmail.com");

        AddressEntry newEntry3 = new AddressEntry("Barry", "Allen", "Baker", "Palm Beach", "FL", "49231",
                "(896)178-5316", "ballen@gmail.com");

        AddressEntry newEntry4 = new AddressEntry("John", "Stewart", "Annadale", "San Diego", "CA", "87312",
                "(368)290-8206", "jstewart@gmail.com");

        ab.addEntry(newEntry1);
        ab.addEntry(newEntry2);
        ab.addEntry(newEntry3);
        ab.addEntry(newEntry4);

        ab.entryList.remove(newEntry2);
        assertEquals(newEntry3, ab.entryList.get(1));

        ab.entryList.remove(newEntry1);
        assertEquals(newEntry4, ab.entryList.get(1));
    }

    @Test
    void findContact()
    {
        AddressEntry newEntry1 = new AddressEntry("Clark", "Kent", "Sunset Boulevard", "Austin", "TX", "95762",
                "(408)782-2349", "cklent@gmail.com");

        AddressEntry newEntry2 = new AddressEntry("Bruce", "Wayne", "Oakwood Avenue", "Seattle", "WA", "92192",
                "(612)923-5232", "bwayne@gmail.com");

        AddressEntry newEntry3 = new AddressEntry("Barry", "Allen", "Baker", "Palm Beach", "FL", "49231",
                "(896)178-5316", "ballen@gmail.com");

        AddressEntry newEntry4 = new AddressEntry("John", "Stewie", "Annadale", "San Diego", "CA", "87312",
                "(368)290-8206", "jstewart@gmail.com");

        AddressEntry newEntry5 = new AddressEntry("David", "Watson", "Oxbridge", "Baltimore", "MD", "61823",
                "(418)621-4710", "dwatson@gmail.com");

        AddressEntry newEntry6 = new AddressEntry("Bob", "Kettle", "Rochester", "Memphis", "TN", "28132",
                "(167)261-1592", "bkook@gmail.com");

        String searchStr1 = "wa";
        String searchStr2 = "k";

        ArrayList<AddressEntry> WayneWatson = new ArrayList<AddressEntry>();        //Target string for "wa"
        WayneWatson.add(newEntry2);
        WayneWatson.add(newEntry5);

        ArrayList<AddressEntry> KentKettle = new ArrayList<AddressEntry>();         //Target string for "k"
        KentKettle.add(newEntry1);
        KentKettle.add(newEntry6);

        ArrayList<AddressEntry> contactWithWA = new ArrayList<AddressEntry>();     //Test string to look contacts with "wa"
        ArrayList<AddressEntry> contactWithK = new ArrayList<AddressEntry>();      //Test string to look for contacts with "k"

        ab.addEntry(newEntry1);
        ab.addEntry(newEntry2);
        ab.addEntry(newEntry3);
        ab.addEntry(newEntry4);
        ab.addEntry(newEntry5);
        ab.addEntry(newEntry6);

        for (AddressEntry addressEntry : ab.entryList)
        {
            if (addressEntry.getLastName().toUpperCase().contains(searchStr1.toUpperCase()))
            {
                contactWithWA.add(addressEntry);
            }
        }

        for (AddressEntry addressEntry : ab.entryList)
        {
            if (addressEntry.getLastName().toUpperCase().contains(searchStr2.toUpperCase()))
            {
                contactWithK.add(addressEntry);
            }
        }
        assertEquals(WayneWatson, contactWithWA);
        assertEquals(KentKettle, contactWithK);
    }

    @Test
    void listContacts()     // Here we're really just testing if the list is alphabetical
    {
        AddressEntry newEntry1 = new AddressEntry("Clark", "Kent", "Sunset Boulevard", "Austin", "TX", "95762",
                "(408)782-2349", "cklent@gmail.com");

        AddressEntry newEntry2 = new AddressEntry("Bruce", "Wayne", "Oakwood Avenue", "Seattle", "WA", "92192",
                "(612)923-5232", "bwayne@gmail.com");

        AddressEntry newEntry3 = new AddressEntry("Barry", "Allen", "Baker", "Palm Beach", "FL", "49231",
                "(896)178-5316", "ballen@gmail.com");

        AddressEntry newEntry4 = new AddressEntry("John", "Stewie", "Annadale", "San Diego", "CA", "87312",
                "(368)290-8206", "jstewart@gmail.com");

        AddressEntry newEntry5 = new AddressEntry("David", "Watson", "Oxbridge", "Baltimore", "MD", "61823",
                "(418)621-4710", "dwatson@gmail.com");

        AddressEntry newEntry6 = new AddressEntry("Bob", "Kettle", "Rochester", "Memphis", "TN", "28132",
                "(167)261-1592", "bkook@gmail.com");

        ab.addEntry(newEntry1);
        ab.addEntry(newEntry2);
        ab.addEntry(newEntry3);
        ab.addEntry(newEntry4);
        ab.addEntry(newEntry5);
        ab.addEntry(newEntry6);

        ArrayList<AddressEntry> sortedContactsList = new ArrayList<AddressEntry>();  // Sorted list of contacts

        sortedContactsList.add(newEntry3);
        sortedContactsList.add(newEntry1);
        sortedContactsList.add(newEntry6);
        sortedContactsList.add(newEntry4);
        sortedContactsList.add(newEntry5);
        sortedContactsList.add(newEntry2);

        ArrayList<AddressEntry> entryListClone;     // Test list to compare to sorted list
        entryListClone = (ArrayList<AddressEntry>) ab.entryList.clone();
        entryListClone.sort(Comparator.comparing(AddressEntry::getLastName));

        assertEquals(sortedContactsList, entryListClone);

    }
}