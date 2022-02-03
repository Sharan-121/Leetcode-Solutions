import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int target = 5;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            if(arr[start]+arr[end] == target){
                return new int[]{start+1,end+1};
            }
            else if(arr[start]+arr[end] < target){
                start+=1;
            }
            else{
                end-=1;
            }
        }
        return new int[]{-1,-1};
    }
}
