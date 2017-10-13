package student_diary;

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
	    c.set(2016,1);
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
}
