import java.util.Arrays;

public class MissingNumber_Brute {
    public static void main(String[] args) {
        System.out.println(missing(new int[] {3,0,1}));
    }
    private static int missing(int[] nums){
        Arrays.sort(nums);
        int i = 0;
        for( i=0 ; i<nums.length ; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return i + 1;
            }
        }
        return i;
    }
}
