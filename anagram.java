import java.util.*;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] arr = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (str1.charAt(i) == arr[j]) {

                    arr[j] = '\0';
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}