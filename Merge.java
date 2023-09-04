/**
 * Merge
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum = nums1.length;
        int[] newInt = new int[sum];
        int n1 = m;
        int n2 = n;
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; i < sum; i++) {
            if (n1 > 0 && n2 > 0) {
                int temp1 = nums1[pos1];
                int temp2 = nums2[pos2];
                if (temp1 <= temp2) {
                    newInt[i] = temp1;
                    pos1++;
                    n1--;
                } else {
                    newInt[i] = temp2;
                    pos2++;
                    n2--;
                }
            } else {
                if (n1 > 0) {
                    newInt[i] = nums1[pos1];
                    pos1++;
                } else {
                    newInt[i] = nums2[pos2];
                    pos2++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        merge(nums1, 3, nums2, 3);

    }
}