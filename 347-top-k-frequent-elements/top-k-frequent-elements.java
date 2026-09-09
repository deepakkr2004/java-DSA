class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->
            map.get(a) - map.get(b)
        );
        for(int num : map.keySet()){
            pq.offer(num);
        }
        while(pq.size() > k){
            pq.poll();
        }
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}