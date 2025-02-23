public class IfRotate_Brute {
    public static void main(String[] args) {
        System.out.println(IfRotated(new int[] {6,7,8,3,4}));
    }
    private static boolean IfRotated(int[] nums){
        //count is used to determine whether the array is rotated or not
        int count = 0;
        //this will increase the count if the array is sorted ex : {1,2,3,4}
        if(nums[0] < nums[nums.length-1]){
            count++;
        }
        //this will increase the count if the array is rotated ex : {3,4,1,2}
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] < nums[i-1]){
                count++;
            }
        }
        //return false if the count is greater than 1
        return(count<2);
    }
}
