package student_diary;

import java.io.Serializable;
import java.util.Scanner;

public class Attendance implements Serializable {
	int attend;
	int totalNoOfHours;
	
	public Attendance() {
		attend=1;
		totalNoOfHours=1;
	}
	public void getAttendance() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter no of hours attented");
		 attend=s.nextInt();
		 System.out.println("Enter Total no of hours");
		 totalNoOfHours=s.nextInt();
	}
	
	int finalAttend=0;
	//finalAttend=attend/totalNoOfHours;	
	
	public void showAttend() {
		System.out.println("Total Number of hours Attended is"+attend);
		System.out.println("Total Number of hours"+totalNoOfHours);
		System.out.println("Final Attendance"+finalAttend);
	}

}

