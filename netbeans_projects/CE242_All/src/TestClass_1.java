
/**
 * @author ardalahmet
 */
public class TestClass_1
{
    public class ListNode
    {
        public int data;
        public ListNode next;
        // ...
    }
    
    public class List
    {
        public ListNode head;
        // ...
    }
    
    // a)
    public static int size(List list)
    {
        int counter = 0;

        for (ListNode n = list.head; n != null; n = n.next)
        {
            ++counter;
        }

        return counter;
    }

    // b)
    public static void print(List list)
    {
        for (ListNode n = list.head; n != null; n = n.next)
        {
            System.out.println(n.data + ", ");
        }
    }

    // c)
    public static boolean contains(List list, int x)
    {
        for (ListNode n = list.head; n != null; n = n.next)
        {
            if (n.data == x)
            {
                return true;
            }
        }

        return false;
    }

    // e)
    public static void remove(List list, int x)
    {
        ListNode n = list.head;

        if (n == null)  // list is empty
        {
            return;
        }

        if (n.data == x)    // head node will be removed
        {
            list.head = list.head.next;
            return;
        }

        while (n.next != null)
        {
            if (n.next.data == x)
            {
                break;
            }
            n = n.next;
        }

        if (n.next == null) // cannot find x
        {
            return;
        }
        else    // x is found, remove it from the list
        {
            n.next = n.next.next;
        }
    }
}
