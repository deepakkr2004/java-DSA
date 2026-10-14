class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num * 9 < sum){
            return "";
        }
        int nine = sum / 9;
        int remaining = sum % 9;
        StringBuilder sb = new StringBuilder();
        while(nine > 0){
            sb.append('9');
            nine--;
        }
        if(remaining > 0){
            sb.append(remaining);
        }
        while(sb.length() < num){
            sb.append('0');
        }
        return sb.toString();
    }
}