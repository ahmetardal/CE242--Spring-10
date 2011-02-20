
/**
 * @author ardalahmet
 */
public class StudentArray
{
    // private data members
    private Student[] studArr;
    private int       nItems;

    // constructor
    public StudentArray(int max)
    {
        studArr = new Student[max];
        nItems  = 0;
    }

    public int size()
    {
        return nItems;
    }

    // returns the student from the array with the index specified
    public Student getStudent(int idx)
    {
        return studArr[idx];
    }

    // finds a student in the array by his student id.
    // since the array is ordered by student ids,
    // find() performs a binary search on the array.
    public int find(int studentId)
    {
        int leftIdx  = 0;
        int rigthIdx = nItems - 1;
        int midIdx;

        while (true)
        {
            if (leftIdx > rigthIdx)
            {
                return -1;
            }

            midIdx = (leftIdx + rigthIdx ) / 2;
            if (studArr[midIdx].getStudentID() == studentId)
            {
                return midIdx;
            }

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

    // inserts a student into the array without breaking the order of the array,
    // so this is a sorted insert operation
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

    // removes a student from the array
    public boolean delete(int studentId)
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

    // displays all the students in the array
    public void display()
    {
        for (int j = 0; j < nItems; ++j)
        {
            studArr[j].Display();
        }
    }
}
