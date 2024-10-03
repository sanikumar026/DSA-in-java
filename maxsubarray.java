public class maxsubarray {
    public static void max_sumarray(int numbers[]) {
        int currentsum= 0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            int start=  i;

            for(int j=i;j<numbers.length;j++) {
                int end = j;
                currentsum=0;
                for(int k= start;k<=end;k++) {
                //sub array sum
                currentsum +=numbers[k];
                    }
               System.out.println(currentsum);
                if(max<currentsum) {
                    max=currentsum;
                 }
            }

        }
        System.out.print("max subarray is :" +max);
    
        
        
    }
    // could not understand this code 
    //code is not  wrong

public static void main(String[] args) {
    int numbers[]= {2,3,4,8,9};
    max_sumarray(numbers);
    
}
}
