import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates_Brute {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicate(new int[] {1,2,2,4,4,5,6,7,8,8,5,6,7}));
    }
    private static int RemoveDuplicate(int[] nums){
        //creating a treeset
        TreeSet<Integer> set = new TreeSet<>();
        //adding every element in the set
        for(int el : nums){
            set.add(el);
        }
        //Now this set will have the values which is not duplicated and in the order
        //now we iterate the set elements to the array
        int index = 0;
        for(int el : set){
            nums[index] = el;
            index++;
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
