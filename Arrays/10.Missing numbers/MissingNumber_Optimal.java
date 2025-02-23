public class MissingNumber_Optimal {
    public static void main(String[] args) {
        System.out.println(missing(new int[] {3,0,1}));
    }
    private static int missing(int[] nums){
        int sum = (nums.length * (nums.length+1))/2;
        for(int i=0 ; i <nums.length ; i++){
            sum -= nums[i];
        }
        return sum;
    }
}
