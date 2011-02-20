
/**
 * @author ardalahmet
 */
public class StudentListNode
{
    public int studentId;
    public int grade;
    public StudentListNode next;

    public StudentListNode()
    {
        studentId = 0;
        grade = 0;
        next  = null;
    }

    public StudentListNode(int _studentId, int _grade)
    {
        studentId = _studentId;
        grade = _grade;
        next  = null;
    }
}
