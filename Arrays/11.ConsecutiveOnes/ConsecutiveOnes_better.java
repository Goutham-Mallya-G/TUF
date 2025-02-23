public class ConsecutiveOnes_better {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,0,1,1,1};
        System.out.println(Consecutive(nums));
    }
    private static int Consecutive(int[] nums){
        int sum = 0;
        int temp = 0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]==1){
                sum++;
            }
            else{
                temp = Math.max(temp , sum);
                sum =0;
            }
        }
        if(sum > 0){
            temp = Math.max(temp , sum);
        }
        return temp;
    }
}
