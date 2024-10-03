public class PairsArray {
    public static void Pairs(int Array[]) {
        int pairs=0;
       for(int i=0;i<Array.length;i++) {
        int current= Array[i];
       for(int j=i+1;j<Array.length;j++) {
          System.out.print("(" +current +"," +Array[j] +")");
          pairs++;
       }
       System.out.println();
       }
       System.out.print("Total pairs are :" +pairs);
    }
    public static void main(String[] args) {
        int Array[] = {2,3,4,5,6};
        Pairs(Array);

    }
}
