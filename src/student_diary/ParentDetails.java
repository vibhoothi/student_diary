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
		
		ParentDetails(String dName,String mName, String mail, String no,String occ)
		{
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
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Father's Name");
			dadName=sc.next();
			System.out.println("Enter your Mother's Name");
			momName=sc.next();
			System.out.println("Enter your father's phone number");
			pNo=sc.next();
			System.out.println("Enter the email");
			email=sc.next();
			System.out.println("Enter father's occupation");
			occupation=sc.next();
		}
		public void readFile() {
			try {
				FileInputStream fin = new FileInputStream("ParentDetail.ser");
				ObjectInputStream ois = new ObjectInputStream(fin);
				ParentDetails p = (ParentDetails) ois.readObject();
				this.dadName = p.dadName;
				this.momName = p.momName;
				this.email = p.email;
				this.pNo = p.pNo;
				this.occupation = p.occupation;
				fin.close();
			}catch (FileNotFoundException fnf){
				System.out.println(fnf);
				
			}catch (IOException ioe) {
				System.out.println(ioe);
			}catch (ClassNotFoundException cnf) {
				System.out.println(cnf);
			
			}
		}
		public void writeFile() {
			try {
				FileOutputStream fout = new FileOutputStream("ParentDetail.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				ParentDetails p = new ParentDetails(this.dadName, this.momName, this.email, this.pNo, this.occupation);
				oos.writeObject(p);
				fout.close();
			}catch (FileNotFoundException fnf){
				System.out.println(fnf);
				
			}catch (IOException ioe) {
				System.out.println(ioe);
			
			}
		}
		
		public void displayData() {
			System.out.println("Dad's Name:"+dadName);
			System.out.println("Mom's Name:"+momName);
			System.out.println("Phone:"+pNo);
			System.out.println("Email:"+email);
			System.out.println("Occupation:"+occupation);
		}

		
		

	}