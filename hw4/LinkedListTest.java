
/**
 * @author ardalahmet
 */
public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.deleteLast();
        list.insertFirst(1);
        list.deleteLast();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.deleteLast();

        list.insertBefore(13, 7);

        list.deleteByValue(3);

        list.print();

        LinkedList revList1 = list.reverseListIter();
        revList1.print();

        LinkedList revList2 = LinkedList.reverseListRec(list.head);
        revList2.print();
    }
}
