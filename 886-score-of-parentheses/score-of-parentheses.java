class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(score);
                score = 0;
            }else{
                if(s.charAt(i-1) == '('){
                    score = 1 + st.peek();
                }else{
                    score = (2 * score) + st.peek();
                }
                st.pop();
            }
        }
        return score;
    }
}