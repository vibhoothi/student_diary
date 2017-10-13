package student_diary;

import java.text.SimpleDateFormat;
import java.util.*;
public class student {
	String name;
	String rollNo;
    String campus;
	Date dob;
	public student() {
		name="";
		rollNo="";
	    Calendar c = Calendar.getInstance();
	    c.set(2016,1,1);
		dob=c.getTime();	
	}
	public student(String name,String rollNo,String campus,Date dob) {
		this.name=name;
		this.rollNo=rollNo;
		this.campus=campus;
		this.dob=dob;
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
	public void newStudent() {
		System.out.println("Enter name");
		Scanner s= new Scanner(System.in);
		this.name=s.next();
		this.rollNo=s.next();
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
	 SimpleDateFormat date =new SimpleDateFormat("dd/MM/yyyy");
	 System.out.println("DOB"+date.format(dob));
	 
	 
	 
	}
}
