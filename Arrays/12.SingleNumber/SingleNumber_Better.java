import java.util.HashMap;

public class SingleNumber_Better {
    public static void main(String[] args) {
        System.out.println(single(new int[] { 1, 2, 1, 2, 4}));
    }
    private static int single(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i],value + 1);
        }
        for(int i=0 ; i<nums.length ; i++){
            if(map.get(nums[i]) == 1){
                return nums[i] ;
            }
        }
        return -1;
    }
}
