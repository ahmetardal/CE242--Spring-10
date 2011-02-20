
/**
 *
 * @author ardalahmet
 */
public class CE242_HW2
{
    public static void main(String[] args)
    {
        String str = "";

        System.out.print("Enter a text: ");
        str = Keyboard.readString();

        if (isPalindrome(str, 0, (str.length() - 1)))
        {
            System.out.println("yes, palindrome.");
        }
        else
        {
            System.out.println("no, not a palindrome.");
        }

        System.out.print("\nEnter a number: ");
        int n = Keyboard.readInt();
        System.out.println("fibonacci(" + n + ") = " + calcFibonacciTerm(n));

        System.out.print("\nEnter a text: ");
        str = Keyboard.readString();
        printReverse(str, 0);
        System.out.println("");
    }

    public static boolean isPalindrome(String s, int leftIdx, int rightIdx)
    {
        // base case
        if (leftIdx >= rightIdx)
        {
            return true;
        }

        // general case
        if (s.charAt(leftIdx) == s.charAt(rightIdx))
        {
            return isPalindrome(s, (leftIdx + 1), (rightIdx - 1));
        }

        return false;
    }

    public static int calcFibonacciTerm(int nth)
    {
        // base case
        if ((nth == 0) || (nth == 1))
        {
            return nth;
        }

        // general case
        return calcFibonacciTerm(nth - 1) + calcFibonacciTerm(nth - 2);
    }

    public static void printReverse(String s, int startIdx)
    {
        // base case
        if (startIdx == s.length())
        {
            return;
        }

        // general case
        printReverse(s, (startIdx + 1));
        System.out.print(s.charAt(startIdx));
    }
}
