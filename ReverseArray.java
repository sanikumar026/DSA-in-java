
public class ReverseArray {
    public static void ReverseArray(int marks[]) {
        int first= 0;
        int last = marks.length -1;
        while(first<last) {
            int temp = marks[first];
            marks[first]=marks[last];
            marks[last]=temp;
            first ++;
            last--;
        }

    }
    public static void main(String[] args) {
        int marks[]={3,4,6,12,24};
       ReverseArray(marks);
       for(int i=0;i<marks.length;i++) {
          System.out.print(marks[i] +" ");
       }
      // System.out.println();
    }
}
