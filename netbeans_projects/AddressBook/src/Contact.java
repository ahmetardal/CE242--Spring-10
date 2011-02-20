
import java.util.Scanner;

/**
 * @author ardalahmet
 */
public class Contact
{
    // private data members
    private String FullName;
    private String Email;
    private String CellPhoneNo;
    private String Address;

    // constructors
    public Contact()
    {
        this.FullName    = "";
        this.Email       = "";
        this.CellPhoneNo = "";
        this.Address     = "";
    }

    public Contact(String FullName, String Email, String CellPhoneNo, String Address)
    {
        this.FullName    = FullName;
        this.Email       = Email;
        this.CellPhoneNo = CellPhoneNo;
        this.Address     = Address;
    }

    public static Contact parseContact(String line)
    {
        Scanner s  = new Scanner(line);
        Contact c = new Contact();

        s.useDelimiter(",");

        c.setFullName(s.next().trim());
        c.setEmail(s.next().trim());
        c.setCellPhoneNo(s.next().trim());
        c.setAddress(s.next().trim());

        s.close();

        return c;
    }

    public void display()
    {
        System.out.println("   Name: " + this.FullName);
        System.out.println("  Email: " + this.Email);
        System.out.println("  Phone: " + this.CellPhoneNo);
        System.out.println("Address: " + this.Address);
    }

    // accessor (getter/setter) methods
    public String getFullName()
    {
        return FullName;
    }

    public void setFullName(String FullName)
    {
        this.FullName = FullName;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getCellPhoneNo()
    {
        return CellPhoneNo;
    }

    public void setCellPhoneNo(String CellPhoneNo)
    {
        this.CellPhoneNo = CellPhoneNo;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }
}
