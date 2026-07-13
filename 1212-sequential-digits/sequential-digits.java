class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=9; i++){
            int num = 0;
            for(int digit=i; digit<=9; digit++){
                num = num * 10 + digit;
                if(num >= low && num <=high){
                    ans.add(num);
                }
                if(num > high){
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}