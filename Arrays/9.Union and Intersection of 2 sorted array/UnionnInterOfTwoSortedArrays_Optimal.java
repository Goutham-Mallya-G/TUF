import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionnInterOfTwoSortedArrays_Optimal {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = new int[] {3,4,5,6,7};
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {4,9,4,8,4};
        System.out.println(Union(arr1 , arr2));
        System.out.println(intersection(arr1 , arr2));
        System.out.println(Arrays.toString(inter(nums1, nums2)));
        System.out.println(Arrays.toString(mostoptimal(nums1, nums2)));
    }
    private static ArrayList<Integer> Union(int[] arr1 , int[] arr2){
        ArrayList<Integer> union = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        //iterating the elements in the arrays
        while(i < n1 && j < n2){
            //taking the least element from the both arrays
            if(arr1[i] <= arr2[j]){
                //if it is the first element or the previous element is not equal, we add the element of arr1
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            //or we add the element of arr2, if the condition is met
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        //even if the arr2 is finished iterating, we still iterate the 1st array
        while(i<n1){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        //even if the arr1 is finished iterating, we still iterate the 2nd array
        while(j<n2){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
    return union;
    }
    private static ArrayList<Integer> intersection(int[] arr1 , int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]) {
                i++;
            }
            else if(arr2[j] < arr1[i]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    //Unique elements
    private static int[] inter(int[] nums1, int[] nums2){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int el : nums1){
            s1.add(el);
        }
        for(int el: nums2){
            if(s1.contains(el)){
                s2.add(el);
            }
        }
        int index = 0;
        int[] ans = new int[s2.size()];
        for(int el : s2){
            ans[index++] = el;
        }
        return ans;
    }
    private static int[] mostoptimal(int[] nums1 , int[] nums2){
        int[] freq = new int[1001];
        for(int el : nums1){
            freq[el] = 1;
        }
        int count = 0;
        for(int el : nums2){
            if(freq[el]==1){
                freq[el] = 2;
                count++;
            }
        }
        int[] ans = new int[count];
        int index = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 2){
                ans[index++] = i;
            }
        }
        return ans;
    }
}
