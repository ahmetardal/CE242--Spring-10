
/**
 *
 * @author ardalahmet
 */
public class CE242_HW3
{
    public static void main(String[] args)
    {
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        printArrayReverse(a, 0);
        System.out.println("");

        int key = 7;
        int idx = binarySearch(a, key, 0, (a.length - 1));

        if (idx == -1)
        {
            System.out.println("not found.");
        }
        else
        {
            System.out.println("found at index: " + idx);
        }
    }

    public static void printArrayReverse(int[] arr, int startIdx)
    {
        // base case
        if (startIdx == arr.length)
        {
            return;
        }

        // general case
        printArrayReverse(arr, (startIdx + 1));
        System.out.print(arr[startIdx] + ", ");
    }

    public static int binarySearch(int[] arr, int key, int leftIdx, int rightIdx)
    {
        if (leftIdx > rightIdx)
        {
            return -1;
        }

        int midIdx = (leftIdx + rightIdx) / 2;
        if (key == arr[midIdx])
        {
            return midIdx;
        }

        if (key < arr[midIdx])
        {
            return binarySearch(arr, key, leftIdx, (midIdx - 1));
        }

        return binarySearch(arr, key, (midIdx + 1), rightIdx);
    }
}
