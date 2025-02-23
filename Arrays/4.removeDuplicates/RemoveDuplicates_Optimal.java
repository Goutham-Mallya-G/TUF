import java.util.Arrays;

public class RemoveDuplicates_Optimal {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RemoveDuplicate(new int[] {1,2,2,3,3,4,5,6,7,7,8})));
    }
    private static int[] RemoveDuplicate(int[] nums){
        int i = 0;
        //this will check the j element is equal to i or not
        //then it will replace the nums[i] with the j'th element and increment i
        for(int j = 0 ; j<nums.length ; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        //prints the index + 1, cause the index starts from 0
        System.out.println(i+1);
        return nums;
    }
}
