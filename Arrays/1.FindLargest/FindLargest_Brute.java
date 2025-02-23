import java.util.Arrays;

public class FindLargest_Brute {
    public static void main(String[] args) {
        System.out.println(findLargest(new int[] {1,2,3,4,5,6}));
    }
    private static int findLargest(int[] nums){
        //sort the array and return the last element
        //NOTE : This will only work when the array has no duplicates
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
