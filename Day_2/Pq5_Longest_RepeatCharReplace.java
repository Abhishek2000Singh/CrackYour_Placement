import java.util.HashMap;
import java.util.Map;

public class Pq5_Longest_RepeatCharReplace {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int maxFreq = 0;
        Map<Character, Integer> mpp = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, mpp.get(c));

            // Calculate the current length of the window
            int len = right - left + 1;

            // Check if the window can be adjusted within the limits of k changes
            if (len - maxFreq > k) {
                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                left++;
            }
            // Update maxlen with the current valid window size
            if (len - maxFreq <= k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
        }

        return maxlen;
    }
    
public static void main(String[] args) {
    
}
}
