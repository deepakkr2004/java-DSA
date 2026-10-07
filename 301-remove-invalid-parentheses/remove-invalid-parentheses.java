import java.util.*;

class Solution {

    int n;
    Set<String> set = new HashSet<>();
    int maxLen;

    void solve(String s, int i, StringBuilder curr, int count) {

        // If ')' makes balance negative, invalid
        if (count < 0) {
            return;
        }

        // Reached the end
        if (i == n) {

            if (count == 0) {

                // Found a longer valid string
                if (curr.length() > maxLen) {
                    maxLen = curr.length();
                    set.clear();
                }

                // Store all valid strings of maximum length
                if (curr.length() == maxLen) {
                    set.add(curr.toString());
                }
            }

            return;
        }

        // If current character is normal alphabet
        if (s.charAt(i) != '(' && s.charAt(i) != ')') {

            curr.append(s.charAt(i));

            solve(s, i + 1, curr, count);

            curr.deleteCharAt(curr.length() - 1);

            return;
        }

        // OPTION 1: Keep the current parenthesis
        curr.append(s.charAt(i));

        solve(
            s,
            i + 1,
            curr,
            count + (s.charAt(i) == '(' ? 1 : -1)
        );

        curr.deleteCharAt(curr.length() - 1);

        // OPTION 2: Remove the current parenthesis
        solve(s, i + 1, curr, count);
    }

    public List<String> removeInvalidParentheses(String s) {

        n = s.length();
        set.clear();
        maxLen = 0;

        StringBuilder curr = new StringBuilder();

        solve(s, 0, curr, 0);

        return new ArrayList<>(set);
    }
}