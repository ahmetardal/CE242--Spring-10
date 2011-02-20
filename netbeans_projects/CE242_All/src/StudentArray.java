
/**
 * @author ardalahmet
 */
public class StudentArray
{
    private Student[] studArr;
    private int       nItems;

    public StudentArray(int max)
    {
        studArr = new Student[max];
        nItems  = 0;
    }

    public int size()
    {
        return nItems;
    }

    public int find(long studentId)
    {
        int leftIdx  = 0;
        int rigthIdx = nItems - 1;
        int midIdx;

        while (true)
        {
            midIdx = (leftIdx + rigthIdx ) / 2;
            
            if (studArr[midIdx].getStudentID() == studentId)
            {
                return midIdx;
            }

            if (leftIdx > rigthIdx)
            {
                return -1;
            }
            else
            {
                if (studArr[midIdx].getStudentID() < studentId)
                {
                    leftIdx = midIdx + 1;
                }
                else
                {
                    rigthIdx = midIdx - 1;
                }
            }
        }
    }

    public void insert(Student st)
    {
        int j;

        for (j = 0; j < nItems; ++j)
        {
            if (studArr[j].getStudentID() > st.getStudentID())
            {
                break;
            }
        }

        for (int k = nItems; k > j; --k)
        {
            studArr[k] = studArr[k - 1];
        }
        studArr[j] = st;
        ++nItems;
    }

    public boolean delete(long studentId)
    {
        int j = find(studentId);

        if (j == -1)
        {
            return false;
        }
        else
        {
            for (int k = j; k < nItems; ++k)
            {
                studArr[k] = studArr[k+1];
            }
            --nItems;
            return true;
        }
    }

    public void display()
    {
        for (int j = 0; j < nItems; ++j)
        {
            studArr[j].Display();
        }
    }

//    public static void main(String[] args)
//    {
//        StudentArray sa = new StudentArray(10);
//        sa.insert(new Student(125, "Ahmet Sessiz", 52));
//        sa.insert(new Student(124, "Zeynep Dertli", 25));
//        sa.insert(new Student(123, "Tarik Umutlu", 32));
//
//        sa.display();
//    }
}
