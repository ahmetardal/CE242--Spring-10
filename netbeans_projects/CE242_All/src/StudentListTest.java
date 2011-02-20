
/**
 * @author ardalahmet
 */
public class StudentListTest
{
    public static void main(String[] args)
    {
        // create a student list
        StudentList stList = new StudentList();
        StudentListNode stNode;

        // add some items to the list
        stNode = new StudentListNode(123, 55);
        stList.append(stNode);

        stNode = new StudentListNode(124, 65);
        stList.append(stNode);

        stNode = new StudentListNode(125, 75);
        stList.append(stNode);

        stNode = new StudentListNode(126, 85);
        stList.append(stNode);

        stNode = new StudentListNode(127, 95);
        stList.append(stNode);

        // traverse the nodes of the list and print what it contains
        System.out.println("printing the list:");
        for (StudentListNode n = stList.head; n != null; n = n.next)
        {
            System.out.println(n.studentId + ", " + n.grade);
        }

        // add two more items to the list
        stNode = new StudentListNode(128, 35);
        stList.append(stNode);

        stNode = new StudentListNode(129, 25);
        stList.append(stNode);

        // print it again
        System.out.println("printing the list again:");
        for (StudentListNode n = stList.head; n != null; n = n.next)
        {
            System.out.println(n.studentId + ", " + n.grade);
        }
    }
}
