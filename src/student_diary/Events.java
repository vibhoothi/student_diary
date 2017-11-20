package student_diary;
import java.io.Serializable;
import java.util.Scanner;
public class Events implements Serializable {
	String eventName;
	String prize;
	String place;
	public Events() {
		eventName="Test ";
		prize="Tset ";
		place=" Test";
	}
	public void addEvent() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter Event Name");
		 eventName = s.next();
		 System.out.println("Enter Prize");
	     prize = s.next();
	     System.out.println("Enter Place of event");
	     place=s.next();
	}
	public void display() {
		System.out.println("Event Name :"+eventName);
		System.out.println("Prize :"+prize);
		System.out.println("Place :"+place);
	}
}
