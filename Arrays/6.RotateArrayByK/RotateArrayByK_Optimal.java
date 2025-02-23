import java.util.Arrays;

public class RotateArrayByK_Optimal {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RotateArray(new int[] {1,2,3,4,5,6,7} , 3)));
    }
    private static int[] RotateArray(int[] nums, int k){
        k=k%nums.length;
        reverse(nums, 0 , nums.length-k-1); //{4,3,2,1,5,6,7}
        reverse(nums, nums.length-k , nums.length-1); // {,4,3,2,1,7,6,5}
        reverse(nums, 0 , nums.length-1);//{,5,6,7,1,2,3,4}
        return nums;
    }
    private static int[] reverse(int[] nums, int start , int end){
        for(int i = start ; i<end ; i++){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
