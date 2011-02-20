
/**
 * @author ardalahmet
 */
public class DLinkedList
{
    public DListNode first;
    public DListNode last;
// -------------------------------------------------------------
    public DLinkedList()
    {
        first = null;
        last  = null;
    }
// -------------------------------------------------------------
    public boolean isEmpty()
    {
        return (first == null);
    }
// -------------------------------------------------------------
    public void insertionSort()
    {
        if (isEmpty()) return;
        if (first.next == null) return;
        
        DListNode node2insert = first.next;

        while (node2insert != null)
        {
            
            node2insert = node2insert.next;
        }
    }
// -------------------------------------------------------------
    public void insertFirst(int data)
    {
        DListNode newNode = new DListNode(data);   // make new link

        if(isEmpty())                // if empty list,
        {
            last = newNode;             // newLink <-- last
        }
        else
        {
            first.prev = newNode;   // newLink <-- old first
        }
        newNode.next = first;          // newLink --> old first
        first = newNode;               // first --> newLink
    }
// -------------------------------------------------------------
    public void insertLast(int data)   // insert at end of list
    {
        DListNode newNode = new DListNode(data);   // make new link
        
        if(isEmpty())                // if empty list,
        {
            first = newNode;            // first --> newLink
        }
        else
        {
            last.next = newNode;        // old last --> newLink
            newNode.prev = last;    // old last <-- newLink
        }
        last = newNode;                // newLink <-- last
    }
// -------------------------------------------------------------
    public DListNode deleteFirst()         // delete first link
    {                              // (assumes non-empty list)
        DListNode temp = first;

        if(first.next == null)         // if only one item
        {
            last = null;                // null <-- last
        }
        else
        {
            first.next.prev = null; // null <-- old next
        }
        first = first.next;            // first --> old next
        return temp;
    }
// -------------------------------------------------------------
    public DListNode deleteLast()          // delete last link
    {                              // (assumes non-empty list)
        DListNode temp = last;
        
        if(first.next == null)         // if only one item
        {
            first = null;               // first --> null
        }
        else
        {
            last.prev.next = null;  // old previous --> null
        }
        last = last.prev;          // old previous <-- last
        return temp;
    }
// -------------------------------------------------------------
//                                     // insert dd just after key
//   public boolean insertAfter(long key, long dd)
//      {                              // (assumes non-empty list)
//      DListNode current = first;          // start at beginning
//      while(current.dData != key)    // until match is found,
//         {
//         current = current.next;     // move to next link
//         if(current == null)
//            return false;            // didn't find it
//         }
//      DListNode newLink = new DListNode(dd);   // make new link
//
//      if(current==last)              // if last link,
//         {
//         newLink.next = null;        // newLink --> null
//         last = newLink;             // newLink <-- last
//         }
//      else                           // not last link,
//         {
//         newLink.next = current.next; // newLink --> old next
//                                      // newLink <-- old next
//         current.next.previous = newLink;
//         }
//      newLink.previous = current;    // old current <-- newLink
//      current.next = newLink;        // old current --> newLink
//      return true;                   // found it, did insertion
//      }
//// -------------------------------------------------------------
//   public DListNode deleteKey(long key)   // delete item w/ given key
//      {                              // (assumes non-empty list)
//      DListNode current = first;          // start at beginning
//      while(current.dData != key)    // until match is found,
//         {
//         current = current.next;     // move to next link
//         if(current == null)
//            return null;             // didn't find it
//         }
//      if(current==first)             // found it; first item?
//         first = current.next;       // first --> old next
//      else                           // not first
//                                     // old previous --> old next
//         current.previous.next = current.next;
//
//      if(current==last)              // last item?
//         last = current.previous;    // old previous <-- last
//      else                           // not last
//                                     // old previous <-- old next
//         current.next.previous = current.previous;
//      return current;                // return value
//      }
//// -------------------------------------------------------------
//   public void displayForward()
//      {
//      System.out.print("List (first-->last): ");
//      DListNode current = first;          // start at beginning
//      while(current != null)         // until end of list,
//         {
//         current.displayLink();      // display data
//         current = current.next;     // move to next link
//         }
//      System.out.println("");
//      }
//// -------------------------------------------------------------
//   public void displayBackward()
//      {
//      System.out.print("List (last-->first): ");
//      DListNode current = last;           // start at end
//      while(current != null)         // until start of list,
//         {
//         current.displayLink();      // display data
//         current = current.previous; // move to previous link
//         }
//      System.out.println("");
//      }
}
