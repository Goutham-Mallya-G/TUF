import java.util.Arrays;

public class SecondLargest_Brute {
    public static void main(String[] args) {
        System.out.println(SecondLargest(new int[] {1,2,3,4,5,6,7,8}));
    }
    private static int SecondLargest(int[] nums){
        //sort the array and return the second last element
        //NOTE : This will work only when the array has no duplicates
        Arrays.sort(nums);
        return nums[nums.length-2];
    }
}
