public class largestnumber {
    public  static int getlargest(int Array[]) {
        int largest= Integer.MIN_VALUE ;//-infinite
        int SMALLEST = Integer.MAX_VALUE;// +infintite
        for(int i =0;i<Array.length; i++) {
           if(largest<Array[i]) {
          largest=Array[i];
            }
            if(SMALLEST>Array[i]) {
                SMALLEST=Array[i];
            }

            
        }
        System.out.println("smallest number is :"+SMALLEST);
        return largest;

    }
    public static void main(String[] args) {
        int Array[]= {3,4,1,90,292,89,45,100,21};
        
     int largenumber =  getlargest(Array);
     System.out.println("largest number is :" +largenumber);
     // second method ...easy method
     //System.out.println("largest number is :" +getlargest(Array));
    }
}
