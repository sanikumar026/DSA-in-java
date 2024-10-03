public class bubblesort {
    public static void BubbleSort(int array[]) {
        int n= array.length;
        //loop for turns i=turns
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            }
        }
        
    }

    //for print array
    public static void printArray(int array[]) {
        for(int i=0;i<array.length;i++) {
           System.out.print( array[i] +" ");
        }
    }
    public static void main(String[] args) {
        int array[]= {5,4,1,3,2}; 
        BubbleSort(array);
        printArray(array);
    }
}
