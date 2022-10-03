import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private static int noOfPupils;
    private List<Student> students = new ArrayList<Student>();
    School(String name)
    {
        this.name = name;
        noOfPupils = 0;
    }
    School(String name, List<Student> students)
    {
        this.name = name;
        this.students = students;
        noOfPupils = 0;
    }
    public String getSchoolName()
    {
        return this.name;
    }
    public void addPupil(Student student)
    {
        students.add(student);
        noOfPupils ++;
    }
    public List<Student> getStudents()
    {
        return this.students;
    }
}
