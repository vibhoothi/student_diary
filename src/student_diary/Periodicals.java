package student_diary;

import java.util.Scanner;

public  class Periodicals implements Marks {
	int p1Marks;
	int p2Marks;
	Periodicals(){
		p1Marks=0;
		p2Marks=0;	
	}
	public int getMarks() {
		return p1Marks+p2Marks;
	}
	public void setMarks(int p1,int p2) {
		p1Marks=p1;
		p2Marks=p2;
	}
	public void addMark() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Periodical 1 marks");
		p1Marks=s.nextInt();
		System.out.println("Enter Periodical 2 Marks");
		p2Marks=s.nextInt();
		s.close();
	}
	public void display() {
		System.out.println("First Periodical:"+p1Marks);
		System.out.println("Second Periodical :"+p2Marks);
	}
}