class Solution {
    public boolean checkString(String s) {
        int count_a = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                count_a++;
            }
        }
        for(int i=0; i<count_a; i++){
            if(s.charAt(i) != 'a'){
                return false;
            }
        }
        return true;
    }
}