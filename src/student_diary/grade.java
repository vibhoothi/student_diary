package student_diary;

public class grade {
  char grade;
  String ratings;
  float points;
  public grade() {
	  grade='F';
	  ratings="FAILED";
	  points=0;
  }
  void calcGrade(float p) {
	  if(p>5.0 && p<6.0) {
		  grade='P';
		  ratings="PASS";
	   }	
	  else if(p>6.0 && p<7.0) {
		  grade='C';
		  ratings="AVERAGE";  
	  }
	  else if(p>7.0 && p<8.0) {
		  grade='B';
		  ratings="ABOVE AVERAGE";
	  }
	  else if(p>8.0 && p<9.0) {
		  grade='B';
		  ratings="GOOD";
	  }
	  else if(p>9.0 && p<10.0) {
		  grade='A';
		  ratings="Excellent";
	  }
	  else {
		  grade='I';
		  ratings="Incomplete";
	  }
  }



}
