//import java.util.*;

public class Array2 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++) {
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={100,200,300};
        update(marks);
        for(int i=0;i<marks.length;i++) {

        
        System.out.print(marks[i] +" ");
        }
        System.out.println();
    }
}
