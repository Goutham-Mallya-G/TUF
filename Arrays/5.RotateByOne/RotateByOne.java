import java.util.Arrays;

public class RotateByOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(LeftRotate(new int[] {1,2,3,4,5,6,7})));
        System.out.println(Arrays.toString(RightRotate(new int[] {1,2,3,4,5,6,7})));
    }
    private static int[] LeftRotate(int[] nums){
        //store the first element
        int temp = nums[0];
        //this will shift all the elements one place left
        for(int i=1 ; i<nums.length ; i++){
            nums[i-1] = nums[i];
        }
        //place the first element in the last index
        nums[nums.length-1] = temp;
        return nums;
    }
    private static int[] RightRotate(int[] nums){
        //store the last index
        int temp = nums[nums.length-1];
        //this will shift all the elements one place right
        for(int i=nums.length-1 ; i>0 ; i--){
            nums[i] = nums[i-1];
        }
        //place the last element in the first index
        nums[0] = temp;
        return nums;
    }
}
