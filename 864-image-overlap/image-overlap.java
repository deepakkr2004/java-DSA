class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxCount = 0;
        for(int rowoffset=-n+1; rowoffset<n; rowoffset++){
            for(int coloffset=-n+1; coloffset<n; coloffset++){
                int count = overlap(img1, img2, rowoffset, coloffset);
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
    private int overlap(int[][] img1, int[][] img2, int rowoffset, int coloffset){
        int n = img1.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int B_i = i + rowoffset;
                int B_j = j + coloffset;
                if(B_i < 0 || B_i >= n || B_j < 0 || B_j >= n){
                    continue;
                }
                if(img1[i][j] == 1 && img2[B_i][B_j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}