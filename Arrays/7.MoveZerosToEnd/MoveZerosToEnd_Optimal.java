import java.util.Arrays;

public class MoveZerosToEnd_Optimal {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,0,4,0,3,6,0,6};
        MoveZero(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void MoveZero(int[] nums){
        int index = 0;
        //iterating all the elements in the array
        for(int j=0 ; j<nums.length ; j++){
            //if the element is non-zero store the element in the index of the array
            if(nums[j]!=0) {
                nums[index] = nums[j];
                index++;
            }
        }
        //make zero for the remianing elements
        for(int j = index; j<nums.length ; j++) {
            nums[j] = 0;
        }
    }
}
