public class ConsecutiveOnes_Brute {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,0,1,1,1};
        System.out.println(consecutive(nums));
    }
    private static int consecutive(int[] nums){
        int temp = 0;
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 1){
                sum++;
                if(sum > temp){
                    temp = sum;
                }
            }
            else{
                sum = 0;
            }
        }
        return temp;
    }
}
