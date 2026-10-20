class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : happiness){
            pq.offer(num);
        }
        long ans = 0;
        int count = 0;
        while(k > 0 && pq.size() != 0){
            int max = pq.poll();
            int value = max - count;

            if(value > 0){
                ans += value;
            }
            count++;
            k--;
        }
        return ans;
    }
}