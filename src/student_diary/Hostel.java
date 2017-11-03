package student_diary;

public class Hostel {
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
	public void display() {
		System.out.println("Hostel Name is :"+hostelName);
		System.out.println("Room Number is"+roomNo);
	}
}
