public class SingleElement540 {
    public static void main(String[] args) {
       System.out.println(singleNonDuplicate(new int[]{1,1,2,2,3,4,4}));
    }

    public static int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] == arr[mid + 1]) {
                if (mid % 2 == 0) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else {
                if (mid % 2 == 0) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }
            }
        }
        return arr[start];

    }
}