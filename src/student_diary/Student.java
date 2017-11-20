package student_diary;

import java.text.SimpleDateFormat;
import java.util.*;
public class student {
	String name;
	String rollNo;
    String campus;
	Date dob;
	String gender;
	int semester;
	String branch;
	public student() {
		name="";
		rollNo="";
	    Calendar c = Calendar.getInstance();
	    c.set(2016,1,1);
		dob=c.getTime();	
		gender=" ";
		semester=1;
		branch=" ";
	}
	public student(String name,String rollNo,String campus,Date dob,String gender,int semester,String branch) {
		this.name=name;
		this.rollNo=rollNo;
		this.campus=campus;
		this.dob=dob;
		this.gender=gender;
		this.semester=semester;
		this.branch=branch;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		return dob;
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
		this.name=s.next();
		this.rollNo=s.next();
		this.branch=s.next();
		this.gender=s.next();
		this.semester=s.nextInt();
		this.campus=s.next();
		System.out.println("Enter DOB(YYYY/MM/DD) order");
		int year,month,day;
		year=s.nextInt();
		month=s.nextInt();
		day=s.nextInt();
		Calendar ca=Calendar.getInstance();
		ca.set(year, month, day);
		s.close();
	}
	public void printDetails() {
	 System.out.println("Name"+name);
	 System.out.println("rollNo"+name);	
	 System.out.println("campus"+name);
	 System.out.println("Branch:"+branch);
	 System.out.println("Semester"+semester);
	 System.out.println("gender:"+branch);
	 SimpleDateFormat date =new SimpleDateFormat("dd/MM/yyyy");
	 System.out.println("DOB"+date.format(dob));
	 
	 
	 
	}
}
