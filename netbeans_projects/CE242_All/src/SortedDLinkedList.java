
/**
 * @author ardalahmet
 */
public class SortedDLinkedList
{
    public DListNode first;
    public DListNode last;
// -------------------------------------------------------------
    public SortedDLinkedList()
    {
        first = null;
        last  = null;
    }    

    public void insertSorted(int data)
    {
        DListNode newNode = new DListNode(data);

        // if the list is empty
        if (first == null)
        {
            first = newNode;
            last  = newNode;
            return;
        }

        // find appropriate position for the new node
        DListNode current = first;
        while ((current != null) && (newNode.data > current.data))
        {                             // or key > current,
            current = current.next;       // go to next item
        }

        // if the new node is being inserted as the last node
        if (current == null)
        {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            return;
        }

        // if the new node is being inserted as the first node
        if (current == first)
        {
            first = newNode;
            newNode.prev = current.prev;
            current.prev = newNode;
            newNode.next = current;
            return;
        }

        // if the new node is being inserted as a normal node
        current.prev.next = newNode;
        newNode.prev = current.prev;
        current.prev = newNode;
        newNode.next = current;
    }

    public void printReverse()
    {
        for (DListNode n = last; n != null; n = n.prev)
        {
            System.out.print(n.data + ", ");
        }
    }



}