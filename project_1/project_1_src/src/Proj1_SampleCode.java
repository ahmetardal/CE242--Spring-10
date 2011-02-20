
import java.io.*;

/**
 * @author ardalahmet
 */
public class Proj1_SampleCode
{
    public static void main(String[] args) throws Exception
    {
        // how to use the Student class
        Student st1 = new Student();
        Student st2 = new Student(123, "Kamil Kosan", 37);

        st1.setStudentID(321);
        st1.setFullName("Dursun Giden");
        st1.setAge(29);

        st1.Display();
        st2.Display();
        System.out.println(st2.getStudentID() + ", " + st2.getFullName() + ", " + st2.getAge());

        // how to use the StudentArray class
        StudentArray sa = new StudentArray(20);
        sa.insert(new Student(345, "Deniz Dalgali", 25));
        sa.insert(st2);
        sa.insert(st1);

        System.out.println("index: " + sa.find(321));
        sa.display();

        for (int i = 0; i < sa.size(); ++i)
        {
            Student st = sa.getStudent(i);
            System.out.println(st.getStudentID() + ", " + st.getFullName() + ", " + st.getAge());
        }

        // how to read Student objects from a text file
        File f = new File("read_students.txt");
        if (!f.exists())
        {
            System.out.println("file not found: " + f.getName());
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        Student st;
        String line;

        while ((line = br.readLine()) != null)
        {
            st = Student.ParseStudent(line);
            st.Display();
        }
        br.close();

        // how to write Student objects to a text file
        f = new File("write_students.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        line = st1.getStudentID() + ", " + st1.getFullName() + ", " + st1.getAge();
        bw.write(line);
        bw.newLine();

        line = st2.getStudentID() + ", " + st2.getFullName() + ", " + st2.getAge();
        bw.write(line);
        bw.newLine();

        bw.close();
    }
}
