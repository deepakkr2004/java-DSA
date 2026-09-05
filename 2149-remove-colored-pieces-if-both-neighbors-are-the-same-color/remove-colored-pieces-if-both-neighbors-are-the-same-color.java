class Solution {
    public boolean winnerOfGame(String colors) {
        int str = colors.length();
        if(str < 3){
            return false;
        }
        int Alice = 0;
        int Bob = 0;
        for(int i=1; i<str-1; i++){
            if(colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                if(colors.charAt(i) == 'A'){
                    Alice++;
                }else{
                    Bob++;
                }
            }
        }
        return Alice > Bob ? true : false;
    }
}