import java.util.Arrays;

public class RotateArrayByK_Brute {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RotateArray(new int[] {1,2,3,4,5,6} , 2)));
    }
    private static int[] RotateArray(int[] nums, int k){
        //reducing the rotation by dividing it to the length of the array
        k = k%nums.length;
        //store the last k elements in the array in temp
        int[] temp = new int[k];
        int index =0;
        for(int i=nums.length-k ; i<nums.length ; i++){
            temp[index] = nums[i];
            index++;
        }
        //shifting the remaining element to the right
        for(int i=nums.length-1 ; i>=k ; i--){
            nums[i]= nums[i-k];
        }
        //replacing the elements in the array from temp
        for(int i=0 ; i<k ; i++){
            nums[i] = temp[i];
        }

        return nums;
    }
}
