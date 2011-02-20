
/**
 *
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args)
    {
        // -----------------------------------------------------
        // variable declarations & initializations
        int i;
        long l = 50;
        double d = 45.555;
        char c = 'c';
        // -----------------------------------------------------

        // -----------------------------------------------------
        // array declarations & initializations
        double[] da = new double[5];
        int[] ia = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        // -----------------------------------------------------

        // -----------------------------------------------------
        // if statement
        int x = -5;
        if (x < 0)
        {
            System.out.println("x is negative.");
        }
        else if (x > 0)
        {
            System.out.println("x is positive.");
        }
        else
        {
            System.out.println("x is zero.");
        }
        // -----------------------------------------------------

        // -----------------------------------------------------
        // for loop
        for (int k = 0; k < 10; ++k)
        {
            System.out.print("a");
        }
        System.out.println("");

        // print an array using for loop
        for (int k = 0; k < ia.length; ++k)
        {
            System.out.print(ia[k] + ", ");
        }
        System.out.println("");
        // -----------------------------------------------------

        // -----------------------------------------------------
        // while loop (print the same array using while loop)
        int n = 0;
        while (n < ia.length)
        {
            System.out.print(ia[n] + ", ");
            ++n;
        }
        System.out.println("");
        // -----------------------------------------------------

        // -----------------------------------------------------
        // function calls
        printA(5);
        int m = 7;
        printA(m);
        // -----------------------------------------------------
    }

    // an example function definition with no return value and one integer parameter
    public static void printA(int n)
    {
        for (int k = 0; k < n; ++k)
        {
            System.out.print("a");
        }
        System.out.println("");
    }
}
