public class SingleNumber_Brute {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(SingleNumber(nums));
    }
    private static int SingleNumber(int[] nums){
        int i;
        for(i=0 ; i<nums.length ; i++){
            int count = 0;
            for(int j=0 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return nums[i];
    }
}
