public class sub_Array {
    public static void subarray(int numbers[]) {
        int total=0;
        for(int i=0;i<numbers.length;i++) {
            int start=  i;
            for(int j=i;j<numbers.length;j++) {
                int end = j;
                for(int k= start;k<=end;k++) {
                    System.out.print(numbers[k]+" ");
                    
                }
                total++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.print("total subarray are :" +total);
    }
    public static void main(String[] args) {
        int numbers[]= {2,3,4,8,9};
        subarray(numbers);
    }
}
