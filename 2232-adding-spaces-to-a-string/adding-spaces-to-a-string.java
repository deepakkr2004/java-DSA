class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(j<spaces.length && i==spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}