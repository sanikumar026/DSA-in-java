public class kadane_max {
    public static void  kadanesum(int numbers[]) {
     int currentsum= 0;
     int max= Integer.MIN_VALUE;
     for(int i =0;i<numbers.length;i++) {
        currentsum= currentsum+ numbers[i];
        if(currentsum<0) {
            currentsum=0;
            
        }
        max= Math.max(currentsum,max);
     }
     System.out.println("here is max sum of sub array:" +max);
    }
    public static void main(String[] args) {
        int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        
        kadanesum(numbers);
    }
}
