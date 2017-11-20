package student_diary;
import java.util.Scanner;
public class events {
	String eventName;
	String prize;
	String place;
	public events() {
		eventName=" ";
		prize=" ";
		place=" ";
	}
	public void addEvent() {
		 Scanner s = new Scanner(System.in);
		 this.eventName = s.next();
	     this.prize = s.next();
	     this.place=s.next();
	}
	public void display() {
		System.out.println("Event Name:"+eventName);
		System.out.println("Prize:"+prize);
		System.out.println("Place"+place);
	}
}
