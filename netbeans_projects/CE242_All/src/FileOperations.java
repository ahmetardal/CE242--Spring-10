
import java.io.*;

/**
 * @author ardalahmet
 */
public class FileOperations
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("students.txt");

        if (f.exists())
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("file not found");
        }

        BufferedReader br = new BufferedReader(new FileReader(f));

        String line;
        while ((line = br.readLine()) != null)
        {
            Student.ParseStudent(line).Display();
        }

        br.close();
    }
}
