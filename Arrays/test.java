import java.util.Arrays;

public class test {
    public static void main(String[] args) {
            int[] arr = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(Arrays.toString(testcase(arr)));
    }
    public static int[] testcase(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            // If the current element is non-zero
            if (nums[i] != 0) {

                // Swap the current element with the 0 at index 'count'
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;

                // Move 'count' pointer to the next position
                count++;
            }
        }

        return nums;
    }
}
