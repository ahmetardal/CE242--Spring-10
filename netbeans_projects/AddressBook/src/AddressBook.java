
import java.io.*;

/**
 * @author ardalahmet
 */
public class AddressBook
{
    // loads all contacts from file to a ContactArray
    public static ContactArray LoadContactList(String filePath) throws Exception
    {
        File f = new File(filePath);
        if (!f.exists())
        {
            return null;
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        ContactArray ca = new ContactArray(250);
        Contact c;
        String line;

        while ((line = br.readLine()) != null)
        {
            c = Contact.parseContact(line);
            ca.insert(c);
        }
        br.close();

        return ca;
    }

    // saves all contacts in the ContactArray to the file
    public static void SaveContactList(String filePath, ContactArray contacts) throws Exception
    {
        File f = new File(filePath);
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        Contact c;
        String line;

        for (int i = 0; i < contacts.size(); ++i)
        {
            c = contacts.getContact(i);
            line = c.getFullName() + ", " + c.getEmail() + ", " + c.getCellPhoneNo() + ", " + c.getAddress();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
