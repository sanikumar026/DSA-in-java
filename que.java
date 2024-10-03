public class que {
    public static int total(int arr[], int  target){
   int l=0;
   int r= arr.length-1;
   int count =0;

     while(l<=r){
        if(arr[l]+arr[r]>target){
          return -1;
        }
        count++;
        l++;
        r--;
     }
     return count;

    }
   public static void main(String[] args) {
    int arr[]= {3,3,7,12,12,13};
    int target= 20;
   System.out.print(total(arr,20)); 

   } 
}
