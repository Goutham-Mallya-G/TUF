import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class UnionnInterOfTwoSortedArrays_Brute {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {4,5,6,6,7};
        int[] num1 = new int[] {4,9,5};
        int[] num2 = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(Union(arr1 , arr2)));
        System.out.println(Intersection(num1 , num2));
        System.out.println(Arrays.toString(inter(num1, num2)));
    }
    private static int[] Union(int[] arr1, int[] arr2 ){
        //creating a treeset so it can have no duplicate values and it is sorted
        TreeSet<Integer> set = new TreeSet<>();
        //iterating the array and adding each element to the set
        for(int el : arr1){
            set.add(el);
        }
        //iterating the array and adding each element to the set
        for(int el : arr2) {
            set.add(el);
        }
        int index =  0;
        //creating the array for the size of the set
        int[] union = new int[set.size()];
        //replacing the set elements to the array
        for(int el: set){
            union[index] = el;
            index++;
        }
        return union;
    }
    private static ArrayList<Integer> Intersection(int[] arr1 , int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        //creating a visited array, So we can make sure the element is already taken or not
        int[] visted = new int[arr2.length];
        //iterating through each element of arr1
        for(int i =0 ; i<arr1.length ; i++){
            //iterating through the each element of the arr2
            for(int j =0 ; j<arr2.length ; j++){
                //comparing the both are same and it is not taken already
                if(arr1[i] == arr2[j] && visted[j] == 0 ){
                    list.add(arr1[i]);
                    //marking the arr2 index as taken in the visited array
                    visted[j] = 1;
                    break;
                }
                //since it is sorted, the element cannot be bigger than the element we compare
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return list;
    }
    //unique elements in intersection
    private static int[] inter(int[] nums1, int[] nums2){
        TreeSet<Integer> list = new TreeSet<>();
        int[] visited = new int[nums2.length];
        for(int i = 0; i<nums1.length ; i++){
            for(int j = 0; j<nums2.length ; j++){
                if(nums1[i] == nums2[j] && visited[j]==0 ){
                    list.add(nums1[i]);
                    visited[j] = 1;
                    break;
                }
                if(nums2[j]>nums1[i]){
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        int index = 0;
        for(int el : list){
            ans[index] = el;
            index++;
        }
        return ans;
    }
}
