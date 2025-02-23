public class LinearSearch_Optimal {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6};
        System.out.println(LinearSearch(nums, 5));
    }
    private static boolean LinearSearch(int[] nums , int k){
        //iterate every element and check if that element is equal to k
        for(int el : nums){
            if(el == k){
                return true;
            }
        }
        return false;

    }
}
