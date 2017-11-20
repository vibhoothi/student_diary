package student_diary;

import java.io.Serializable;
import java.util.Scanner;

public class Hostel implements Serializable {
	String hostelName;
	int roomNo;
	public Hostel() {
		hostelName=" ";
		roomNo=0;
	}
	public void setHostelDetails(String hostelName,int roomNo) {
		this.roomNo=roomNo;
		this.hostelName=hostelName;
	}
	public void addHostelDetails() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Hostel name");
		hostelName=s.nextLine();
		System.out.println("Enter Room number");
		roomNo=s.nextInt();
	}
	public void display() {
		System.out.println("Hostel Name is :"+hostelName);
		System.out.println("Room Number is"+roomNo);
	}
}
