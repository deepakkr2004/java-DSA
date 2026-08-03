import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Store frequency of s1 and first window of s2
        for (int i = 0; i < n1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(count1, count2)) {
            return true;
        }

        int j = 0;

        // Slide the window
        for (int i = n1; i < n2; i++) {

            // Add new character
            count2[s2.charAt(i) - 'a']++;

            // Remove old character
            count2[s2.charAt(j) - 'a']--;

            // Compare both arrays
            if (Arrays.equals(count1, count2)) {
                return true;
            }

            // Move left pointer
            j++;
        }

        return false;
    }
}