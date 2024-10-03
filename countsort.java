public class countsort {
    public static void Count_Sort(int array[]) {
        //for size of new of array
        // less lack in understable
        int largest= Integer.MIN_VALUE;
        for(int i= 0;i<array.length;i++) {
          largest= Math.max(largest,array[i]) ;
        }
        int count[]= new int[largest+1];
        for(int i=0;i<array.length;i++) {
            count[array[i]]++;
        }
                int k=0;
        for(int j=0;j<array.length;j++) {
            while(count[j]>0){
                array[k]=j;
                k++;
                count[j]--;
            }
            
        }

    }
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++) {
           System.out.print( array[i] +" ");
        }
    }
    public static void main(String[] args) {
        int array[]= {1,4,1,3,2,4,3,7};
        Count_Sort(array);
        printArray(array);
    }
}
