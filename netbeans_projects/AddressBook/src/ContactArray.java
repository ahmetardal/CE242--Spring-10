
/**
 * @author ardalahmet
 */
public class ContactArray
{
    // private data members
    private Contact[] contacts;
    private int       nItems;

    // constructor
    public ContactArray(int max)
    {
        contacts = new Contact[max];
        nItems   = 0;
    }

    public int size()
    {
        return nItems;
    }

    // returns the contact from the array with the specified index
    public Contact getContact(int idx)
    {
        return contacts[idx];
    }

    // finds a contact in the array by its full name.
    // since the array is ordered by full names,
    // find() performs a binary search on the array.
    public int find(String contactName)
    {
        int leftIdx  = 0;
        int rigthIdx = nItems - 1;
        int midIdx;

        while (leftIdx <= rigthIdx)
        {
            midIdx = (leftIdx + rigthIdx ) / 2;
            if (contacts[midIdx].getFullName().compareTo(contactName) == 0)
            {
                return midIdx;
            }

            if (contacts[midIdx].getFullName().compareTo(contactName) < 0)
            {
                leftIdx = midIdx + 1;
            }
            else
            {
                rigthIdx = midIdx - 1;
            }
        }

        return -1;
    }

    // inserts a contact into the array without breaking the order of the array,
    // so this is a sorted insert operation
    public void insert(Contact c)
    {
        int j;

        for (j = 0; j < nItems; ++j)
        {
            if (contacts[j].getFullName().compareTo(c.getFullName()) > 0)
            {
                break;
            }
        }

        for (int k = nItems; k > j; --k)
        {
            contacts[k] = contacts[k - 1];
        }
        contacts[j] = c;
        ++nItems;
    }

    // removes a contact from the array
    public boolean delete(String contactName)
    {
        int j = find(contactName);

        if (j == -1)
        {
            return false;
        }
        else
        {
            for (int k = j; k < nItems; ++k)
            {
                contacts[k] = contacts[k+1];
            }
            --nItems;
            return true;
        }
    }

    // displays all the contacts in the array
    public void display()
    {
        System.out.println("-----------------------------------------");
        for (int j = 0; j < nItems; ++j)
        {
            contacts[j].display();
            System.out.println("-----------------------------------------");
        }
    }
}
