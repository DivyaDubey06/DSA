import java.util.HashSet;

public class IntersectionOfArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int n : nums1) set1.add(n);

        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result) ans[i++] = n;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        int[] ans = intersection(arr1, arr2);

        for (int n : ans) {
            System.out.print(n + " ");
        }
        // Output: 2
    }
}