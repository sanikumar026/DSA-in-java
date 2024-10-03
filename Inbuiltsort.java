import java.util.Arrays;
import java.util.Collections;

public class Inbuiltsort {
    public static void main(String[] args) {
       // int marks[]= {5,7,1,3,6,2};
        //1 mehod 
       // Arrays.sort(marks);
       // Second method  ----- ending index is non-inclusive;
       //Arrays.sort(marks,0,4);

       // for decreasing order
      //---- 1 method
      Integer marks[]= {2,7,35,71,4,67};
      //Arrays.sort(marks,Collections.reverseOrder());
      Arrays.sort(marks,0,3,Collections.reverseOrder());

        for(int i=0;i<marks.length;i++) {
            System.out.print(+marks[i] +" ");
        }
       
    }
}
