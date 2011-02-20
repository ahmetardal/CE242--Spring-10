
/**
 *
 * @author ardalahmet
 */
public class KeyboardTest
{
    public static void main(String[] args)
    {
        // declare a string variable and print it
        String s = "ankara";
        System.out.println(s);

        // read string from console and print it
        System.out.print("Enter some text: ");
        s = Keyboard.readString();
        System.out.println(s);

        // print the character at 2nd index in the string
        System.out.println(s.charAt(2));

        // read an integer from console and print it
        System.out.print("Enter an integer: ");
        int i = Keyboard.readInt();
        System.out.println(i);

        // read a double from console and print it
        System.out.print("Enter a real number: ");
        double d = Keyboard.readDouble();
        System.out.println(d);
    }
}
