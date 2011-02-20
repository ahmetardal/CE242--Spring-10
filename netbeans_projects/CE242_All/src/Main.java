
/**
 *
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student(3, "Ahmet Ardal", 25);

        s.Display();
        s.setStudentID(13);
        s.Display();

//        int[] a = new int[] {1, 3, 5, 11, 9, 7, 17, 19, 13};
//        int key;
//
//        System.out.print("Enter a number: ");
//        key = Keyboard.readInt();
//
//        int idx = findItem(a, key);
//        if (idx == -1)
//        {
//            System.out.println("not found.");
//        }
//        else
//        {
//            System.out.println("found at index: " + idx);
//        }
//
//        System.out.print("\nEnter a text: ");
//        String str = Keyboard.readString();
//
//        if (isPalindromeRec(str, 0, (str.length() - 1)))
//        {
//            System.out.println("yes, palindrome.");
//        }
//        else
//        {
//            System.out.println("no, not a palindrome.");
//        }
    }

    public static boolean isPalindromeRec(String s, int leftIdx, int rightIdx)
    {
        // base case
        if (leftIdx > rightIdx)
        {
            return true;
        }

        // general case
        if (s.charAt(leftIdx) == s.charAt(rightIdx))
        {
            return isPalindromeRec(s, (leftIdx + 1), (rightIdx - 1));
        }

        return false;
    }

    public static int findItem(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }
}
