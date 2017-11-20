package student_diary;
import java.io.*;
import java.util.Scanner;
public class ParentDetails implements Serializable {
	
		String dadName;
		String momName;
		String email;
		String pNo;
		String occupation;
		ParentDetails(){
			dadName = "";
			momName = "";
			email="";
			pNo="";
			occupation="";
		}
		
		ParentDetails(String dName,String mName, String mail, String no,String occ){
			dadName=dName;
			momName=mName;
			email=mail;
			pNo=no;
			occupation=occ;
		}
		
		public String getDadName(){
			return dadName;
		}
		public String getMomName(){
			return momName;
		}
		public String getEmail(){
			return email;
		}
		public String getPhoneNo(){
			return pNo;
		}
		public String getOccupation(){
			return occupation;
		}
		public void getParentDetails(){
			Scanner s3 = new Scanner(System.in);
			System.out.println("Enter your Father's Name");
			dadName=s3.next();
			System.out.println("Enter your Mother's Name");
			momName=s3.next();
			System.out.println("Enter your father's phone number");
			pNo=s3.next();
			System.out.println("Enter the email");
			email=s3.next();
			System.out.println("Enter father's occupation");
			occupation=s3.next();
		}
		public void displayData() {
			System.out.println("Dad's Name:"+dadName);
			System.out.println("Mom's Name:"+momName);
			System.out.println("Phone:"+pNo);
			System.out.println("Email:"+email);
			System.out.println("Occupation:"+occupation);
		}		
	}