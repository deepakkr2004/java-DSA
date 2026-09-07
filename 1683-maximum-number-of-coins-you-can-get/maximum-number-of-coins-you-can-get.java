class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int result = 0;
        int me = n-2;
        int bob = 0;
        while(bob < me){
            result += piles[me];
            me -= 2;
            bob++;
        }
        return result;
    }
}