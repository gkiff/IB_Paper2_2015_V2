import java.util.*;
public class Student
{
    private int studentID;
    private String studentName;
    private Loan[] booksBorrowed = new Loan[10];
    private int numBooks = 0;
    public Student(int studentID, String studentName)
    {
        this.studentID=studentID;
        this.studentName=studentName;
    }
    public Loan getLoan (int x)
    {
        return this.booksBorrowed[x];
    }
    public void addLoan(Loan book)
    {
        this.booksBorrowed[numBooks] = book;
        numBooks++;
    }
    public int getStudentID()
    {
        return this.studentID;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
}
