
import java.util.Scanner;

/**
 * @author ardalahmet
 */
public class Student
{
    private int     StudentID;
    private String  FullName;
    private int     Age;

    public Student()
    {
        StudentID = 0;
        FullName  = "";
        Age       = 0;
    }

    public Student(int studentID, String fullName, int age)
    {
        StudentID = studentID;
        FullName  = fullName;
        Age       = age;
    }

    public static Student ParseStudent(String line)
    {
        Scanner s  = new Scanner(line);
        Student st = new Student();

        s.useDelimiter(",");
        st.setStudentID(Integer.parseInt(s.next().trim()));
        st.setFullName(s.next().trim());
        st.setAge(Integer.parseInt(s.next().trim()));
        s.close();

        return st;
    }

    public void Display()
    {
        System.out.println(StudentID + ", " + FullName + ", " + Age);
    }

    public int getStudentID()
    {
        return StudentID;
    }

    public void setStudentID(int StudentID)
    {
        this.StudentID = StudentID;
    }

    public String getFullName()
    {
        return FullName;
    }

    public void setFullName(String FirstName)
    {
        this.FullName = FirstName;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }
}
