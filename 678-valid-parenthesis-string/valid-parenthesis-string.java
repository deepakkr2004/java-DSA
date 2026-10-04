class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> openSt     = new Stack<>();
        Stack<Integer> asteriskSt = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openSt.push(i);
            }else if(ch == '*'){
                asteriskSt.push(i);
            }else{
                if(openSt.size() != 0){
                    openSt.pop();
                }else if(asteriskSt.size() != 0){
                    asteriskSt.pop();
                }else{
                    return false;
                }
            }
        }

        while(openSt.size() != 0 && asteriskSt.size() != 0){
            if(openSt.peek() > asteriskSt.peek()){
                return false;
            }
            openSt.pop();
            asteriskSt.pop();
        }
        return openSt.size() == 0;
    }
}