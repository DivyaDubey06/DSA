public class CountVowels {

    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(countVowels(str)); // Output: 2
    }
}