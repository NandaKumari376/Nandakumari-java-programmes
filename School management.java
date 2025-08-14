import java.util.Scanner;
class CollegeManagement {
    Scanner sc=new Scanner(System.in);
    String facultyName;
    String facultyDept;
    String StudentName;
    int rollNumber;
    void setFacultyDetails(String fname, String fdept){
        facultyName=fname;
        facultyDept=fdept;
    }
    void setStudentDetails(String sname, int rno){
        StudentName=sname;
        rollNumber=rno;
    }
    void displayDetails(){
        System.out.println("Enter faculty name:");
        String facultyName=sc.nextLine();
        System.out.println("Enter faculty dept:");
        String facultyDept=sc.nextLine();
        System.out.println("Enter student name:");
        String StudentName=sc.nextLine();
        System.out.println("Enter roll Number:");
        String rollNumber=sc.nextLine();
    }
}
class school extends CollegeManagement{
    int marks;
    void setMarks(int m){
        marks=m;
    }
    void displayStudentwithMarks(){
        displayDetails();
        System.out.println(" Enter Marks:");
        String marks=sc.nextLine();
    }
}
public class Main {
    public static  void main(String[] args){
        school s1=new school();
        s1.displayStudentwithMarks();
    }
}
