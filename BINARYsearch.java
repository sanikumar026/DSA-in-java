public class BINARYsearch {
    public static int binarysearch(int Array[],int key) {
     int start =0;
     int end =Array.length -1;
     while(start<=end) {
        int mid = (start+end)/2;
        if(key==Array[mid]) {
            return mid;
        }
        if(key>Array[mid]) {
            start = mid +1;
        }
        else {
            end = mid-1;
        }


     }
    return -1;

    }

    public static void main(String[] args) {
        int Array[]= {2,4,6,9,15,20,30,40,50};
        int key = 40;
       int BN=  binarysearch(Array,key);
       if(BN==-1){
        System.out.print("Not found");
       }
       else  {
            System.out.println("here is your location:" +BN);
       }
       

    }
}
