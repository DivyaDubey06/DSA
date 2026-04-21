public class LinearSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;

        System.out.println("Index: " + search(arr, target)); // 2
    }
}