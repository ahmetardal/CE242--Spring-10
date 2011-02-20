
/**
 * @author ardalahmet
 */
public class DLinkedListTest
{
    public static void main(String[] args)
    {
        SortedDLinkedList slist = new SortedDLinkedList();

        // add some items to the list
        for (int i = 12; i > 0; --i)
        {
            slist.insertSorted(i * i);
        }
        
        // print items
        for (DListNode n = slist.first; n != null; n = n.next)
        {
            System.out.println(n.data);
        }

        // print items in reverse order
        System.out.println("--------------------------------------");
        slist.printReverse();
    }
}
