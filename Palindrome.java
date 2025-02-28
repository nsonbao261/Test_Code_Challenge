public class Palindrome {

    //Check if given string is palindrome or not
    public static boolean isPalindrome(String str) {
        int first = 0, last = str.length() - 1;

        while (first < last) {
            if(str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    //Count Palindrome substring in given string
    public static int countPalindromeSubstring(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {

            //Count even-length Palindrome substring
            int first = i, last = i + 1;
            if(first >= 0 && last < str.length() && str.charAt(first) == str.charAt(last)) {
                count++;
                first--;
                last++;
            }


            //Count odd-length Palindrome substring
            int left = i, right = i;
            if(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }

        }
        return count;
    }
    public static void main(String[] args) {

        String sampleString1 = "radar";
        String sampleString2 = "hello";
        String sampleString3 = "ababa";


        System.out.println(isPalindrome(sampleString1));   //true
        System.out.println(isPalindrome(sampleString2));   //false
        System.out.println("The number of Palindrome Substring in ababa: " + countPalindromeSubstring(sampleString3));

    }


}
