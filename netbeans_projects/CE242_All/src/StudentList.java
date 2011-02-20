
/**
 * @author ardalahmet
 */
public class StudentList
{
    public StudentListNode head;

    public StudentList()
    {
        head = null;
    }

    public void append(StudentListNode node)
    {
        node.next = head;
        head = node;
    }
}
