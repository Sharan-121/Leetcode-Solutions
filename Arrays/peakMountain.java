public class peakMountain {
    public int peakIndexInMountainArray(int[] arr) {
        return search(arr, 0, arr.length - 1);
    }

    public int search(int arr[], int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0) {
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                } else {
                    return mid + 1;
                }
            } else if (mid == arr.length - 1) {
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    return mid - 1;
                }
            } else if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1] || arr[mid] < arr[mid - 1]) {
                if (arr[mid - 1] > arr[mid + 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }
}