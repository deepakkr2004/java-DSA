class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = plantTime[i];
            arr[i][1] = growTime[i];
        }
        Arrays.sort(arr, (a,b) -> b[1] - a[1]);
        int prevPlantDay = 0;
        int maxBloomDays = 0;
        for(int i=0; i<n ;i++){
            int currPlantTime = arr[i][0];
            int currGrowTime = arr[i][1];

            prevPlantDay += currPlantTime;
            int currBloomTime = prevPlantDay + currGrowTime;

            maxBloomDays = Math.max(maxBloomDays, currBloomTime);
        }
        return maxBloomDays;
    }
}