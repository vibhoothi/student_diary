package student_diary;
import java.io.ObjectOutputStream;
import java.io.Serializable;  
import java.text.SimpleDateFormat;
import java.util.*;
public class Student implements Serializable {
	String name;
	String rollNo;
    String campus;
	String gender;
	int semester;
	String branch;
	public Student() {
		name= "TEST";
		rollNo="000";
		gender="XXX ";
		semester=1;
		branch="S3";
	}
	public Student(String name,String rollNo,String campus,String gender,int semester,String branch) {
		this.name=name;
		this.rollNo=rollNo;
		this.campus=campus;
		this.gender=gender;
		this.semester=semester;
		this.branch=branch;
	}
	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getCampus() {
		return campus;
	}
	public String getGender() {
		return gender;
	}
	public int getSemester() {
		return semester;
	}
	public String getBranch() {
		return branch;
	}
	
	public void newStudent() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Name:");
		name=s.nextLine();
		System.out.println("Enter RollNo");
		rollNo=s.nextLine();
		System.out.println("Enter Branch");		
		branch=s.nextLine();
		System.out.println("Enter Gender");
		gender=s.nextLine();
		System.out.println("Enter semester");
		semester=s.nextInt();
		System.out.println("Enter Campus");
		campus=s.nextLine();
	}
	
	public void printDetails() {
	 System.out.println("Name :"+name);
	 System.out.println("Roll Number :"+rollNo);	
	 System.out.println("Campus Name :"+campus);
	 System.out.println("Branch :"+branch);
	 System.out.println("Semester :"+semester);
	 System.out.println("Gender :"+gender);
	}
	
	
}
