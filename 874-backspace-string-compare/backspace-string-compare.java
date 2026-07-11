class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str){
        Stack<Character> st = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch =='#'){
                if(st.size()!=0){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c : st){
            result.append(c);
        }
        return result.toString();
    }
}