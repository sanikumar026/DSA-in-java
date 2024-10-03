public class selectionsort {
    public static   void Selection_Sort(int arr[]) {
          int n = arr.length;
          for(int i=0;i<n-1;i++) {
              int minPosition= i;
              for(int j=i+1;j<n;j++) {
                  if(arr[minPosition]>arr[j]) {
                      minPosition=j;
                  }
  
              }
              int temp = arr[minPosition];
              arr[minPosition]=arr[i];
              arr[i]=temp;
              
  
          }
  
      }
      public static void printarray(int arr[]) {
          System.out.println("Sorted array is :");
          for(int i=0;i<arr.length;i++) {
              System.out.print(+arr[i] +" ");
          }
      }
      public static void main(String[] args) {
          int arr[]= {5,4,1,3,2};
          Selection_Sort(arr);
          printarray(arr);
      }
  }
  
