import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


// Alternate Solution would be to use binary search for searching the element after sorting the array.
// This could take O(nlogn) time with constant space.
// Hashset approach takes Linear time O(n) with extra space O(n).
// Hence, We could proceed depending on whether to trade off Time or Space.

public class fairCandy {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[] { 1, 2 }, new int[] { 2, 2 })));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        Set<Integer> aliceSet = new HashSet<>();

        for (int i : aliceSizes) {
            sumAlice += i;
            aliceSet.add(i);
        }
        for (int j : bobSizes) {
            sumBob += j;
        }

        int diff = (sumAlice - sumBob) / 2;

        for (int i : bobSizes) {
            if (aliceSet.contains(diff + i)) {
                return new int[] { diff + i, i };
            }
        }
        return new int[] { -1, -1 };

    }
}
