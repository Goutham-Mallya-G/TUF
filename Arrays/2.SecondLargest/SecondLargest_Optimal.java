public class SecondLargest_Optimal {
    public static void main(String[] args) {
        System.out.println(SecondLargest(new int[] {1,2,3,4,5,6,7}));
    }
    private static int SecondLargest(int[] nums){
        int largest = nums[0];
        int secLargest = nums[0];
        //finding the largest and changing second largest comparing to the current element
        for(int el : nums){
            if(el > largest){
                secLargest = largest;
                largest = el;
            }
            //if the element is greater than the second largest but not as equal to the largest update the second largest
            else if(el > secLargest && el!=largest){
                secLargest = el;
            }
        }
        return secLargest;
    }
}
