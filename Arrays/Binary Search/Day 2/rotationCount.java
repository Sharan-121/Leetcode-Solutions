public class rotationCount {
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println((findPivot(arr)+1)%arr.length);

    }
    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = (start + end)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
