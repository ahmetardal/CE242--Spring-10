
/**
 * @author ardalahmet
 */
public class Main
{
    public static void main(String[] args)
    {
        CourseStudentMap map = new CourseStudentMap();

        map.insertStudent("Ahmet");
        map.insertStudent("Mehmet");
        map.insertStudent("Kamil");
        map.insertStudent("Cemil");
        map.insertStudent("Dursun");

        map.insertCourse("CE242");
        map.insertCourse("CE241");
        map.insertCourse("CE308");
        map.insertCourse("CE405");
        map.insertCourse("EE330");

        map.insertRelation("CE242", "Ahmet");
        map.insertRelation("CE242", "Mehmet");
        map.insertRelation("CE241", "Mehmet");
        map.insertRelation("CE241", "Kamil");
        map.insertRelation("CE308", "Ahmet");
        map.insertRelation("CE308", "Mehmet");

        map.printCoursesByStudent("Ahmet");
        map.printCoursesByStudent("Mehmet");
        map.printCoursesByStudent("Kamil");

        map.printStudentsByCourse("CE242");
        map.printStudentsByCourse("CE241");
        map.printStudentsByCourse("CE308");

        map.printCourses();
        map.printStudents();
    }
}
