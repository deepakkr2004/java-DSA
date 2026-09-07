class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int result = 0;
        for(int i=n/3;i<=n-2;i+=2){
            result+=piles[i];
        }
        return result;
    }
}