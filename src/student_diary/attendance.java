package student_diary;

public class attendance {
	String date;
	int att;
	public attendance() {
		date=" ";
		att=0;
	}
	public void addAtt(String date) {
		att=1;
	}
	public void print() {
		System.out.println(" "+ date +":"+att);
	}

}

