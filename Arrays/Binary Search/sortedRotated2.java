
// finding an element in a sorted rotated array with duplicates.

public class sortedRotated2 {
    public static void main(String[] args) {
        int arr[] = {3,3,1,2,3,3};
        int target = 3;
        int pivot = findPivotDuplicates(arr);
        int firstTry = binSearch(arr, 0, pivot, target);
        if(firstTry!=-1){
            System.out.println(firstTry);
        }
        else{
            System.out.println(binSearch(arr, pivot+1, arr.length-1, target));
        }
    }
    public static int findPivotDuplicates(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[mid] == arr[start] && arr[mid]==arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if(arr[mid] < arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int binSearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
