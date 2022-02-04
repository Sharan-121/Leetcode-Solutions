public class kMissing {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1,3,4,5,6,8,9,45}, 12));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] - mid - 1 < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start + k;
    }
}
