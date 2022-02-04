import java.util.*;

// Couple of other approaches could also work in O(nlogn) time.
// Approach 1 - Binary Search.
// Approach 2 - Two Pointer method. (If array is sorted then this takes O(n) time).

public class intersection1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,4}, new int[]{4,5,5,1})));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        for(int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for(Integer num: intersect){
            result[i++] = num;
        }
        return result;
    }
}
