class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] time = new int[dist.length];
        for(int i=0; i<dist.length; i++){
            time[i] = (int) Math.ceil((float) dist[i]/speed[i]);
        }
        Arrays.sort(time);
        int count = 1;
        int time_pass = 1;
        for(int i=1; i<time.length; i++){
            if(time[i] - time_pass <= 0){
                return count;
            }
            count++;
            time_pass++;
        }
        return count;
    }
}