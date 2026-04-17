public class FindMaxMin {

    public static int[] findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int[] ans = findMaxMin(arr);

        System.out.println("Max: " + ans[0]);
        System.out.println("Min: " + ans[1]);
    }
}