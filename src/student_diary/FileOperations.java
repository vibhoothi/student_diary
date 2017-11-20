package student_diary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperations {
	void writeToFile( DataBaseService dataBase2[],String fileName2,int n) {
			 try {
			      ObjectOutputStream out= new ObjectOutputStream( new FileOutputStream(fileName2));
				  out.writeObject(dataBase2);
				  out.flush();
				  out.close();
			   }
			 catch(Exception ex) {
			  	  System.out.println("Excpetion Caught When Writing into File,The exception is:" + ex);
			   }
	}
	DataBaseService[]  readFromFile(String fileName3) {
		 try {
		     ObjectInputStream out2= new ObjectInputStream( new FileInputStream(fileName3));
			 DataBaseService[] dataBase2=(DataBaseService[])out2.readObject();
			 out2.close();
			 return dataBase2;
      	   }
	   catch(Exception e) {
		   System.out.println("Excpetion Caught When Reading from File,The exception is:" + e);
	      }
		return null;
		
	}
}
