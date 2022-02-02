
public class smallestGreater {
    public static void main(String[] args) {

    }

    public static int search(char arr[], char target, int start, int end) {

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start % arr.length;
    }

}
