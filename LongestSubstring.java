import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
