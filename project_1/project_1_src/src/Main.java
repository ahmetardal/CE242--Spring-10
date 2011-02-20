
import java.io.*;

/**
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        // -----------------------------------------------
        // process first file ----------------------------
        // -----------------------------------------------
        File f = new File("students_1.txt");
        if (!f.exists())
        {
            System.out.println("file not found: " + f.getName());
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        StudentArray sa = new StudentArray(50);
        Student st;
        String line;

        while ((line = br.readLine()) != null)
        {
            st = Student.ParseStudent(line);
            if (sa.find(st.getStudentID()) == -1)
            {
                sa.insert(st);
            }
        }
        br.close();

        // -----------------------------------------------
        // process second file ---------------------------
        // -----------------------------------------------
        f = new File("students_2.txt");
        if (!f.exists())
        {
            System.out.println("file not found: " + f.getName());
            System.exit(1);
        }

        br = new BufferedReader(new FileReader(f));

        while ((line = br.readLine()) != null)
        {
            st = Student.ParseStudent(line);
            if (sa.find(st.getStudentID()) == -1)
            {
                sa.insert(st);
            }
        }
        br.close();

        // display student array contents
        sa.display();

        // write all students in the student array to the file "all_students.txt"
        f = new File("all_students.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        for (int i = 0; i < sa.size(); ++i)
        {
            st = sa.getStudent(i);
            line = st.getStudentID() + ", " + st.getFullName() + ", " + st.getAge();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
