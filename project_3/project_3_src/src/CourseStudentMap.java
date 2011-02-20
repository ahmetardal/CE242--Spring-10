
/**
 * @author 
 */
public class CourseStudentMap
{
    private MultiListNode coursesFirst;
    private MultiListNode studentsFirst;

    public CourseStudentMap()
    {
        coursesFirst  = null;
        studentsFirst = null;
    }

    public void insertStudent(String studentName)
    {
        MultiListNode newNode = new MultiListNode(studentName, MultiListNodeType.STUDENT_NODE);
        MultiListNode k = studentsFirst;

        if (k != null)
        {
            do
            {
                k = k.right;
            } while (k.right != studentsFirst);
            k.right = newNode;
            newNode.right = studentsFirst;
        }
        else
        {
          studentsFirst = newNode;
          newNode.right = studentsFirst;
        }
        newNode.down = newNode;
    }

    public void insertCourse(String courseName)
    {
        MultiListNode newNode = new MultiListNode(courseName, MultiListNodeType.COURSE_NODE);
        MultiListNode k = coursesFirst;

        if (k != null)
        {
            do
            {
                k = k.down;
            } while (k.down != coursesFirst);
            k.down = newNode;
            newNode.down = coursesFirst;
        }
        else
        {
            coursesFirst = newNode;
            newNode.down = coursesFirst;
        }
        newNode.right = newNode;
    }

    public MultiListNode insertRelation(String courseName, String studentName)
    {
        MultiListNode lnode = new MultiListNode("", MultiListNodeType.LINK_NODE);
        MultiListNode snode = studentsFirst;
        MultiListNode cnode = coursesFirst;
        int counts = 1;
        int countc = 1;

        do
        {
            if (snode.nodeName.equals(studentName))
            {
                break;
            }
            else
            {
                snode = snode.right;
                ++counts;
            }
        } while (snode != studentsFirst);

        do
        {
            if (cnode.nodeName.equals(courseName))
            {
                break;
            }
            else
            {
                cnode = cnode.down;
                ++countc;
            }
        } while (cnode != coursesFirst);

        while (countc > 1)
        {
            if (snode.down.nodeType != MultiListNodeType.STUDENT_NODE)
            {
                snode=snode.down;
            }
            --countc;
        }
        lnode.down = snode.down;
        snode.down = lnode;

        while (counts > 1)
        {
            if (cnode.right.nodeType != MultiListNodeType.COURSE_NODE)
            {
                cnode=cnode.right;
            }
            --counts;
        }
        lnode.right = cnode.right;
        cnode.right = lnode;

        return lnode;
    }

    public void printCoursesByStudent(String studentName)
    {
        MultiListNode sNode = studentsFirst;

        do
        {
            if (sNode.nodeName.equals(studentName))
            {
                break;
            }
            else
            {
                sNode = sNode.right;
            }
        } while (sNode != studentsFirst);

        if (sNode.down == sNode)
        {
            return;
        }
        else
        {
            MultiListNode j = sNode.down;
            MultiListNode k = sNode.down;

            System.out.print("Courses for '" + sNode.nodeName + "': ");
            while (k != sNode)
            {
                while (j.nodeType != MultiListNodeType.COURSE_NODE)
                {
                    j = j.right;
                }
                System.out.print(j.nodeName + ", ");
                
                while (j != k)
                {
                    j = j.right;
                }
                
                j = j.down;
                k = k.down;
            }
            System.out.println();
        }
    }

    public void printStudentsByCourse(String courseName)
    {
        MultiListNode cNode = coursesFirst;

        do
        {
            if (cNode.nodeName.equals(courseName))
            {
                break;
            }
            else
            {
                cNode = cNode.down;
            }
        } while (cNode != coursesFirst);

        if (cNode.right == cNode)
        {
            return;
        }
        else
        {
            MultiListNode g = cNode.right;
            MultiListNode c = cNode.right;

            System.out.print("Students for '" + cNode.nodeName + "': ");
            while (c != cNode)
            {
                while (g.nodeType != MultiListNodeType.STUDENT_NODE)
                {
                    g = g.down;
                }
                System.out.print(g.nodeName + ", ");
                while (g != c)
                {
                    g = g.down;
                }
                c = c.right;
                g = g.right;
            }
            System.out.println();
        }
    }

    public void printStudents()
    {
        MultiListNode n = studentsFirst;

        System.out.print("Students: ");
        do
        {
            System.out.print(n.nodeName + ", ");
            n = n.right;
        } while (n != studentsFirst);
        System.out.println();
    }

    public void printCourses()
    {
        MultiListNode n = coursesFirst;

        System.out.print("Courses: ");
        do
        {
            System.out.print(n.nodeName + ", ");
            n = n.down;
        } while (n != coursesFirst);
        System.out.println();
    }
}
