package student_diary;

import java.lang.reflect.Array;

public class cgpa{
    float cgpa;
    public cgpa(){
        cgpa=0;
    }
    public cgpa(int x){
        cgpa=x;
    }
   // float[] sgpa =new float[8];
   
    public float calcCgpa(float[] sgpa){
    	int size=Array.getLength(sgpa);
        for(int i=0;i<size;++i) {
        	cgpa+=sgpa[i];
        }
        cgpa=cgpa/size;
        return cgpa;
    }
}