//recursion
// class Solution {

//     public int longestCommonSubsequence(String text1, String text2) {
//         return lcs(text1, text2, text1.length(), text2.length());
//     }

//     public int lcs(String str1, String str2, int n, int m) {

//         // Base case
//         if (n == 0 || m == 0) {
//             return 0;
//         }

//         // Last characters are same
//         if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
//             return lcs(str1, str2, n - 1, m - 1) + 1;
//         }

//         // Last characters are different
//         int ans1 = lcs(str1, str2, n - 1, m);
//         int ans2 = lcs(str1, str2, n, m - 1);

//         return Math.max(ans1, ans2);
//     }
// }

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1]; 
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}