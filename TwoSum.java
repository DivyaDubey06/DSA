import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                return new int[]{map.get(req), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};  // If no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]); // Output: 0 1
    }
}