class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(n==0) return true;
        for(int i=0; i<l; i++){
            if(flowerbed[i] == 0){
                boolean leftKhali = (i==0) || flowerbed[i-1] == 0;
                boolean rightKhali = (i==l-1) || flowerbed[i+1] == 0;
                if(leftKhali && rightKhali){
                    flowerbed[i] = 1;
                    n--;
                }
                if(n == 0){
                    return true;
                }
            }
        }
        return false;
    }
}