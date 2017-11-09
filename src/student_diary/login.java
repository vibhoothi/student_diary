package student_diary;

import java.util.Scanner;

public class login {
	 Scanner s= new Scanner(System.in);
	 void in() {
     String userName,password;
     System.out.println("Enter UserID");
     userName=s.nextLine();
     System.out.println("Enter password");
     password=s.nextLine();
     int passLen;
     passLen=password.length();
  	     int i=0;
  	  System.out.println("++++STUDENT DIARY++++");
  	  System.out.println("Login:");
     System.out.println("	UserID  :"+userName);
     System.out.print("        Password:");
     for( i=0;i<passLen;++i)
     System.out.print("*");
     s.close();
	 }
}
