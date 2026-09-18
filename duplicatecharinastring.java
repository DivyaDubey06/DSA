import java.util.*;

public class duplicatecharinastring{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Print duplicate characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > 1) {
                System.out.print(ch + " ");
                freq[ch] = 0;
            }
        }
    }
}