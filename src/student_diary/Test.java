package student_diary;


import java.util.Scanner;
public class Test  {
    private static Scanner s1;
    
	public static void main(String[] args) throws Exception{
 /* There is a login function where userName 
  * and password is taken as input.
  */
	  Login l = new Login();
      l.in();
    	  s1 = new Scanner(System.in);
    	  String fileName;
    	  int keyStroke;
    	  int n;
    	  int studentNoFlag;
    	  int specificDispFlag;
    	  System.out.println("Please Enter file name you like to have <your_name.txt>");
    	  fileName=s1.nextLine(); 
      System.out.println("Hello "+l.userName+" Welcome to Student diary ");
  
/* In this program we uses database service
 * DataBaseService(DBS) where all the things
 * are stored so you just need to call that 
 * DBS so all the fields are created in it
 * The main Advantage of using this is you 
 * can easily add new feature, find bugs 
 * delete functions.
 */
    	  System.out.println("Enter how many details you want to enter");
      n=s1.nextInt();
 /* Here we take number of events to be taken from 
  * user after that we will make array of type   
  * DataBaseService.
  * To make it into array of objects we  do 
  *    dataBase[i]=new DataBaseService(); where i
  *    is gone till size.
  *  There is another class named FileOperations where 
  *  Writing whole Database to a file (serializing) &
  *  Reading whole Database from file(Deserialzing) is done.
  */
   	  DataBaseService dataBase[] = new DataBaseService[n];
    	  for(int i=0;i<n;++i) {
    		 dataBase[i]=new DataBaseService();
    		}  
      for(int i =0;i<n;++i) {
    		 System.out.println("Enter Student details of "+i);
    	     dataBase[i].studentData.newStudent();
     	 System.out.println("Enter Event details of "+ i);
    		 dataBase[i].eventData.addEvent();
    		 System.out.println("Enter Marks of "+i);
    		 dataBase[i].periodicalsData.addMark();
    		 System.out.println("Enter Hostel details of"+i);
    		 dataBase[i].hostelData.addHostelDetails();
    		 System.out.println("Enter Attendance Details");
    		 dataBase[i].attendanceData.getAttendance();
    		 System.out.println("Enter Parent Details");
    		 dataBase[i].parentData.getParentDetails();
    		}
        FileOperations fo = new FileOperations();
        fo.writeToFile(dataBase,fileName,n);
        DataBaseService dataBase3[]= fo.readFromFile(fileName);
        System.out.println("-----DISPLAY-----");
        System.out.println("1. Display detials of every student");
        System.out.println("2. Display detials of Specific student");
        System.out.println("3. Display specific detials of all students");
        System.out.println("4. Display specific details of specific student");
        System.out.println("5. Exit the program");
        System.out.println("Please enter you choice:");
        keyStroke=s1.nextInt();
        switch(keyStroke) {
        		case 1: 
        				for(int i=0;i<n;++i) {
        			     dataBase3[i].studentData.printDetails();
        			     dataBase3[i].parentData.displayData();
        			     dataBase3[i].eventData.display();
        			     dataBase3[i].hostelData.display();
        			     dataBase3[i].periodicalsData.display();
        			     dataBase3[i].attendanceData.showAttend();
        			    }
        				break;
        		case 2:
        				System.out.println("Enter the Student Number which you want to display");
        				studentNoFlag=s1.nextInt();
        				dataBase3[studentNoFlag].studentData.printDetails();
        			    dataBase3[studentNoFlag].parentData.displayData();
        			    dataBase3[studentNoFlag].eventData.display();
        			    dataBase3[studentNoFlag].hostelData.display();
        			    dataBase3[studentNoFlag].periodicalsData.display();
        			    dataBase3[studentNoFlag].attendanceData.showAttend();
        			    break;
        		case 3:
        				System.out.println("Which details you want to display");
        				System.out.println("1. Student detaails");
        				System.out.println("2. Parent details");
        				System.out.println("3. Event details");
        				System.out.println("4. Periodical Marks");
        				System.out.println("5. Attendace details");
        				specificDispFlag=s1.nextInt();
        				  switch(specificDispFlag) {
        				  			case 1 :
        				  					for(int i=0;i<n;++i)
        				  						dataBase[i].studentData.printDetails();
        				  					break;
        				  			case 2:
        				  					for(int i=0;i<n;++i)
        				  						dataBase[i].parentData.displayData();
        				  					break;
        				  			case 3:
    				  					     for(int i=0;i<n;++i)
    				  					    	 	dataBase[i].eventData.display();
    				  					     break;
        				  			case 4:
    				  						for(int i=0;i<n;++i)
    				  							 dataBase[i].periodicalsData.display();
    				  						break;
        				  			case 5: 
        				  				    for(int i =0;i<n;++i)
        				  				    		dataBase[i].attendanceData.showAttend();
        				  	}
        				  break;
        		case 4:
        				System.out.println("Which details you want to display");
        				System.out.println("1. Student detaails");
        				System.out.println("2. Parent details");
        				System.out.println("3. Event details");
        				System.out.println("4. Periodical Marks");
        				System.out.println("5. Attendace details");
        				specificDispFlag=s1.nextInt();
        				System.out.println("Enter the Student Number which you want to display");
        				studentNoFlag=s1.nextInt();
        				switch(specificDispFlag) {
			  			case 1 :
			  					  dataBase[studentNoFlag].studentData.printDetails();
			  					  break;
			  			case 2:
			  				      dataBase[studentNoFlag].parentData.displayData();
			  					  break;
			  			case 3:
		  					      dataBase[studentNoFlag].eventData.display();
		  					      break;
			  			case 4:
		  						  dataBase[studentNoFlag].periodicalsData.display();
		  						  break;
			  			case 5:
			  				    	  dataBase[studentNoFlag].attendanceData.showAttend();
			  				    	  break;
        					 }
        				break;
        		case 5: 
        				System.out.println("You are exiting");
        				break;
        		}
	  }
}
