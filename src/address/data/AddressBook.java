package address.data;
import java.util.ArrayList;


public class AddressBook
{
    private ArrayList<AddressEntry> entryList;


    public AddressBook()        { entryList = new ArrayList<>();}


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

