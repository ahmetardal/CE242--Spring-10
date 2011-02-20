
/**
 * @author ardalahmet
 */
public class CE242_Exam2_q1
{
    public static void main(String[] args)
    {
        // create 2 lists
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // insert some data
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(7);
        list1.insertLast(9);

        list2.insertLast(0);
        list2.insertLast(2);
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(9);

        // print lists
        System.out.print("List1: ");
        list1.print();

        System.out.print("List2: ");
        list2.print();

        // obtain their intersection using two different methods and print them
        LinkedList intersection;
        intersection = ListIntersectionIter(list1, list2);
        System.out.print("List1, List2 intersection(iterative method): ");
        intersection.print();

        intersection = ListIntersectionRec(list1.head, list2.head);
        System.out.print("List1, List2 intersection(recursive method): ");
        intersection.print();
    }

    public static LinkedList ListIntersectionIter(LinkedList list1, LinkedList list2)
    {
        ListNode n1 = list1.head;
        ListNode n2 = list2.head;
        LinkedList newList = new LinkedList();

        while ((n1 != null) && (n2 != null))
        {
            if (n1.data == n2.data)
            {
                newList.insertLast(n1.data);
                n1 = n1.next;
                n2 = n2.next;
            }
            else if (n1.data < n2.data)
            {
                n1 = n1.next;
            }
            else
            {
                n2 = n2.next;
            }
        }

        return newList;
    }

    public static LinkedList ListIntersectionRec(ListNode head1, ListNode head2)
    {
        // base case
        if ((head1 == null) || (head2 == null))
        {
            return new LinkedList();
        }

        // general case
        if (head1.data == head2.data)
        {
            LinkedList l = ListIntersectionRec(head1.next, head2.next);
            l.insertFirst(head1.data);
            return l;
        }

        if (head1.data < head2.data)
        {
            return ListIntersectionRec(head1.next, head2);
        }

        return ListIntersectionRec(head1, head2.next);
    }
}
