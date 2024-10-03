//incompleted
public class insertionsort {
    public static void Insertion_Sort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int currentP= i;
            int previous= i-1;
            while(previous>=0 && arr[previous]>arr[currentP]) {
                arr[previous+1]=arr[previous];
                previous--;
                
            }
            arr[previous+1]=arr[currentP];
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
           System.out.print( arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Insertion_Sort(arr);
        printArray(arr);
    }
}
