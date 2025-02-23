public class SingleNumber_Optimal {
    public static void main(String[] args) {
        System.out.println(single(new int[] {2,2,4,3,1,3,1}));
    }
    private static int single(int[] nums){
        int xor = 0;
        for(int i =0 ; i<nums.length ; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
