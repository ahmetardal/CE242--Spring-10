
/**
 * @author ardalahmet
 */
public class LinkedList
{
    public ListNode head;

    public LinkedList()
    {
        head = null;
    }

    public void insertFirst(int data)
    {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst()
    {
        if (head != null)
        {
            head = head.next;
        }
    }

    public void deleteLast()
    {
        if (head == null)   // list is empty
        {
            return;
        }

        if (head.next == null)   // list has only one node
        {
            head = null;
            return;
        }

        ListNode n = head;
        while (n.next.next != null)
        {
            n = n.next;
        }

        n.next = null;
    }

    public void deleteByValue(int x)
    {
        if (head == null)   // if list is empty
        {
            return;
        }

        if (head.data == x) // remove the head node
        {
            head = head.next;
            return;
        }

        ListNode n = head;
        while (n.next != null)
        {
            if (n.next.data == x)
            {
                break;
            }
            n = n.next;
        }

        if (n.next == null) // cannot find x, deletion failed
        {
            return;
        }

        // delete x, (here n is the node before x)
        n.next = n.next.next;
    }

    public void insertBefore(int data, int x)
    {
        ListNode newNode = new ListNode(data);

        if (head == null)   // if list is empty
        {
            head = newNode;
            return;
        }

        if (head.data == x) // insert before head
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode n = head;
        while (n.next != null)
        {
            if (n.next.data == x)
            {
                break;
            }
            n = n.next;
        }

        if (n.next == null) // cannot find x, insertion failed
        {
            return;
        }

        // x is found insert newNode before that node (here n is the node before x)
        newNode.next = n.next;
        n.next = newNode;
    }

    public void insertLast(int _data)
    {
        ListNode newNode = new ListNode(_data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        ListNode n;
        for (n = head; n != null; n = n.next)
        {
            if (n.next == null)
            {
                break;
            }
        }
        n.next = newNode;
    }

    public LinkedList clone()
    {
        LinkedList newList = new LinkedList();

        for (ListNode n = head; n != null; n = n.next)
        {
            newList.insertLast(n.data);
        }

        return newList;
    }

    public LinkedList reverseListIter()
    {
        LinkedList newList = new LinkedList();

        for (ListNode n = head; n != null; n = n.next)
        {
            newList.insertFirst(n.data);
        }

        return newList;
    }

    public static LinkedList reverseListRec(ListNode head)
    {
        if (head == null)
        {
            return new LinkedList();
        }

        LinkedList revList = reverseListRec(head.next);
        revList.insertLast(head.data);
        return revList;
    }

    public void print()
    {
        for (ListNode n = head; n != null; n = n.next)
        {
            System.out.print(n.data + ", ");
        }
        System.out.println("");
    }
}
