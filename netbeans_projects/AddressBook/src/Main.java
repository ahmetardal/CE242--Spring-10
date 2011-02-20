
/**
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Loading contact list...");
        ContactArray contacts = AddressBook.LoadContactList("contacts.txt");

        // main program loop
        while (true)
        {
            displayMenu();
            switch (getMenuSelection())
            {
                case 1:
                    displayAllContacts(contacts);
                    break;

                case 2:
                    addNewContact(contacts);
                    break;

                case 3:
                    findContact(contacts);
                    break;

                case 4:
                    deleteContact(contacts);
                    break;

                case 5:
                    System.out.println("Saving contact list and exiting...");
                    AddressBook.SaveContactList("contacts.txt", contacts);
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid menu option.");
                    break;
            }
        }
    }

    public static void displayMenu()
    {
        System.out.println("");
        System.out.println("------- Menu Options -------");
        System.out.println("1 - Display all contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Find a contact");
        System.out.println("4 - Delete a contact");
        System.out.println("5 - Exit");
        System.out.println("----------------------------");
    }

    public static int getMenuSelection()
    {
        System.out.print("Please choose one (enter a number between 1-5): ");
        return Keyboard.readInt();
    }

    public static void displayAllContacts(ContactArray contacts)
    {
        System.out.println("Displaying contacts:");
        contacts.display();
    }

    public static void addNewContact(ContactArray contacts)
    {
        Contact c = new Contact();

        System.out.print("Enter full name: ");
        c.setFullName(Keyboard.readString());

        System.out.print("Enter email: ");
        c.setEmail(Keyboard.readString());

        System.out.print("Enter cell phone number: ");
        c.setCellPhoneNo(Keyboard.readString());

        System.out.print("Enter address: ");
        c.setAddress(Keyboard.readString());

        contacts.insert(c);
        System.out.println("New contact has been added successfully.");
    }

    public static void findContact(ContactArray contacts)
    {
        System.out.print("Enter contact's full name: ");
        String fullName = Keyboard.readString();
        int idx = contacts.find(fullName);

        if (idx == -1)
        {
            System.out.println("Cannot find the contact with name:" + fullName);
            return;
        }

        System.out.println("Contact found:");
        contacts.getContact(idx).display();
    }

    public static void deleteContact(ContactArray contacts)
    {
        System.out.print("Enter contact's full name to delete: ");
        String fullName = Keyboard.readString();
        int idx = contacts.find(fullName);

        if (idx == -1)
        {
            System.out.println("Cannot find the contact with name:" + fullName);
            return;
        }

        contacts.delete(fullName);
        System.out.println("Contact has been deleted successfully.");
    }
}
