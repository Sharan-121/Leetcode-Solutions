import java.util.*;
public class intersection2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,3,1},new int[]{1,2,1,4})));

    } 
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int x : nums1){
            if(binarySearch(nums2,0,nums2.length-1,x)){
                arr.add(x);
            }
        }
        int[] result = new int[arr.size()];
        int i = 0;
        for(Integer num:arr){
            result[i++] = num;
        }
        return result;
    }
    
    public static boolean binarySearch(int[] arr,int start,int end,int target){
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid] > target){
                end = mid-1;   
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }  
}

