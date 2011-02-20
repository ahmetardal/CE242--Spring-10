
import java.io.*;
import java.util.Scanner;

/**
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        CourseStudentMap map = new CourseStudentMap();

        File f = new File("course-student-data.txt");
        if (!f.exists())
        {
            System.out.println("file not found: " + f.getName());
            System.exit(1);
        }

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;

        parseAndInsertStudents(map, br.readLine());
        parseAndInsertCourses(map, br.readLine());

        while ((line = br.readLine()) != null)
        {
            parseAndInsertRelations(map, line);
        }
        br.close();

        map.printCoursesByStudent("Ahmet");
        map.printCoursesByStudent("Mehmet");
        map.printCoursesByStudent("Kamil");

        map.printStudentsByCourse("CE242");
        map.printStudentsByCourse("CE241");
        map.printStudentsByCourse("CE308");

        map.printCourses();
        map.printStudents();
    }

    private static void parseAndInsertCourses(CourseStudentMap map, String line)
    {
        Scanner s = new Scanner(line);

        s.useDelimiter(",");
        while (s.hasNext())
        {
            map.insertCourse(s.next().trim());
        }
        s.close();
    }

    private static void parseAndInsertStudents(CourseStudentMap map, String line)
    {
        Scanner s = new Scanner(line);

        s.useDelimiter(",");
        while (s.hasNext())
        {
            map.insertStudent(s.next().trim());
        }
        s.close();
    }

    private static void parseAndInsertRelations(CourseStudentMap map, String line)
    {
        Scanner s = new Scanner(line);

        s.useDelimiter(":");
        String course   = s.next().trim();
        String students = s.next().trim();
        s.close();

        s = new Scanner(students);
        s.useDelimiter(",");
        while (s.hasNext())
        {
            map.insertRelation(course, s.next().trim());
        }
        s.close();
    }
}
