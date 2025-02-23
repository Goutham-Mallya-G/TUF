public class FindLargest_Optimal {
    public static void main(String[] args) {
        System.out.println(findLargest(new int[]{1,2,3,4,5,6}));
    }
    private static int findLargest(int[] nums){
        //store the first element in the array as the largest number
        int ans = nums[0];
        //iterate through the array and update the element if it is greater than the current largest number
        for(int el : nums){
            if(el > ans){
                ans = el;
            }
        }
        return ans;
    }
}
