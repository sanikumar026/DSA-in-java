public class AraryAssigenment {
    public static boolean duplicate(int array[]) {
        for(int i= 0;i<array.length;i++) {
          for(int j=i+1;j<array.length;j++) {
            if(array[i]==array[j]) {
              
                return true;
            }
          }
        }
        
        return false;
    }
 public static void main(String[] args) {
    int array[] = {2,3,4,5,6,2};
    duplicate(array);
 }
}
