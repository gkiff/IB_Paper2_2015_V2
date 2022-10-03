import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello School Library.");
        Association();
        Aggregation();
    }
    public static void Association()
    {
        School school = new School("Brentwood School.");
        Student student = new Student(1234, "Barbara Jones");
        // Example of an Association relation between two classes in the main method
        System.out.println("Student is : " + student.getStudentName() +
                " a member of " + school.getSchoolName() +
                " the two classes are associated with each other.");
    }
    public static void Aggregation()
    {
        Student student = new Student(1234, "Bob Figs");
        Loan loan = new Loan(321, "The Hitch Hikers Guide.");
        student.addLoan(loan);
        // Aggregation the student has an array of the Loan class
        System.out.println(student.getStudentID() + " has borrowed "+
                loan.getBookTitle());

        // More Aggregation
        School school = new School("Brentwood School.");
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1234, "Ben Griggs"));
        students.add(new Student(1235, "Beryl Lines"));
        students.add(new Student(1236, "Bob Triggs"));
        students.add(new Student(1237, "Boo Pines"));
        students.add(new Student(1238, "Bill Briggs"));

        for(Student stu : students){
            school.addPupil(stu);
        }
        System.out.println(school.getSchoolName() + " has these students enrolled :");
        List<Student> stus = new ArrayList<Student>();
        stus = school.getStudents();
        for(Student stu : stus){
            System.out.println("\t" + stu.getStudentID() + "\t" + stu.getStudentName());
        }

    }
}
