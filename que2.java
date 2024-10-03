public class que2 {
    public static void print(int arr[]){
        int temp =arr[0];
        int n= arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n]=temp;
        
    }
    public static void main(String[] args) {
        int arr[]= {5,3,7,12};
        print(arr);
        for(int  i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
        
    }
}
