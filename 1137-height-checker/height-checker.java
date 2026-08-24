class Solution {
    public int heightChecker(int[] heights) {
        int[] need = heights.clone();
        Arrays.sort(need);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(need[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}