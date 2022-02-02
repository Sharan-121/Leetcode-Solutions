
public class validPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(8));

    }

    public static boolean isPerfectSquare(int x) {

        long start = 1;
        long end = x;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid < x) {
                start = mid + 1;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
