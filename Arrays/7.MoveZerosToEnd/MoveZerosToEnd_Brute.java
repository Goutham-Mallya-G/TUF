import java.util.Arrays;

public class MoveZerosToEnd_Brute {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0,4,0,3,6,0,6};
        System.out.println(Arrays.toString(MoveZeros(nums)));
    }
    private static int[] MoveZeros(int[] nums){
        int count = 0;
        //iterating the array
        for(int i =0 ; i<nums.length-1 ; i++){
            //if the element is zero shift all the elements one place to the left
            if(nums[i] == 0){
                for(int j=i ; j<nums.length-1 ; j++) {
                    nums[j] = nums[j + 1];
                }
                //and add the count, by this we can find how many zeros were there
                count++;
            }
        }
        //replace all the elements in the last to zero
        for(int i=nums.length-1 ; i>=nums.length-count ; i--){
            nums[i] = 0;
        }
        return nums;
    }
}
