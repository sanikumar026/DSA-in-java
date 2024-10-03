import java.util.Arrays;

public class Exer3 {
    public int maxSubArray(int nums[]) {
        Arrays.sort(nums);
        int sum =0;
        for(int i=nums.length-1;i>0;i--) {
            sum+=sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {2,1,-3,4,2,-5};
        System.out.print(maxSubArray(nums));
    }
}

