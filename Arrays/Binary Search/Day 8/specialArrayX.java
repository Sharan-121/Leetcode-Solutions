import java.util.Arrays;

public class specialArrayX{
    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
    }
    public static int specialArray(int[] nums) {
        
        Arrays.sort(nums);
        
        
        for(int i = 1;i<=nums.length;i++){
            if(nums[nums.length-1] < i){
                return -1;
            }
            int numberOfGreater = nums.length - binarySearch(nums,i) ;
            if(numberOfGreater == i){
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] >= target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
        
    }
}