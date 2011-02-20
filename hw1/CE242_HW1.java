
/**
 *
 * @author ardalahmet
 */
public class CE242_HW1
{
    public static void main(String[] args)
    {
        // declare an array
        int[] a = new int[] {1, 3, 5, 11, 9, 7, 17, 19, 13};

        // print all elements of the array
        System.out.println("displaying the array:");
        displayArrayInt(a);

        // find maximum in the array and print it
        int max = findMax(a);
        System.out.println("maximum: " + max);

        // calculate average of the numbers in the array and print it
        double average = calculateAverage(a);
        System.out.println("average: " + average);
    }

    public static void displayArrayInt(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; ++i)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int findMax(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static double calculateAverage(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; ++i)
        {
            sum += arr[i];
        }

        return ((double) sum / arr.length);
    }
}
