class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] arr = costs.clone();
        Arrays.sort(arr);
        int ans = 0;

        for(int cost : arr){
            if(coins >= cost){
                coins -= cost;
                ans++;
            }
        }
        return ans;
    }
}