
import java.util.Scanner;

/**
 * @author ardalahmet
 */
public class Student
{
    // private data members
    private int     StudentID;
    private String  FullName;
    private int     Age;

    // default constructor
    public Student()
    {
        StudentID = 0;
        FullName  = "";
        Age       = 0;
    }

    // constructor with parameters
    public Student(int studentID, String fullName, int age)
    {
        StudentID = studentID;
        FullName  = fullName;
        Age       = age;
    }

    // static function to parse a string that contains one student's data
    // in comma-delimited format. e.g. "133, Name Surname, 22"
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

    // displays a student object
    public void Display()
    {
        System.out.println(StudentID + ", " + FullName + ", " + Age);
    }

    // accessor methods for student class's private data members
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
