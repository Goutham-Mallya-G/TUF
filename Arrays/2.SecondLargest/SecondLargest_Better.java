import com.sun.security.jgss.GSSUtil;

public class SecondLargest_Better {
    public static void main(String[] args) {
        System.out.println(SecLargest(new int[] {1,2,3,4,5,6,7}));
    }
    private static int SecLargest(int[] nums){
        //finding the largest element in the array
        int ans = nums[0];
        for(int el : nums){
            if(el > ans){
                ans = el;
            }
        }
        //finding the second largest element in the array
        int secLarge = nums[0];
        for (int el : nums){
            if(el<ans && el>secLarge){
                secLarge = el;
            }
        }
        return secLarge;
    }
}
