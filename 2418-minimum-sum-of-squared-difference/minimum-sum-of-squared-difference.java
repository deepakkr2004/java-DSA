// class Solution {
//     public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0; i<nums1.length; i++){
//             pq.offer(Math.abs(nums1[i]-nums2[i]));
//         }
//         long k = (long)k1+k2;
//         while(k>0 && pq.peek()>0){
//             int max = pq.poll();
//             pq.offer(max-1);
//             k--;
//         }
//         long ans = 0;
//         while(!pq.isEmpty()){
//             long sq = pq.poll();
//             ans += sq*sq;
//         }
//         return ans;
//     }
// }



class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int n = nums1.length;
        int[] freq = new int[100001];
        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
            max = Math.max(max, diff);
            total += diff;
        }

        if (total <= k) {
            return 0;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            if (freq[d] == 0) {
                continue;
            }

            int count = freq[d];
            int next = d - 1;
            long operations = Math.min(k, (long) count);

            // Reduce one value at a time within this group
            long canReduce = Math.min(k, (long) count);
            if (canReduce == count) {
                freq[next] += count;
                freq[d] = 0;
                k -= count;
            } else {
                freq[d] -= (int) canReduce;
                freq[d - 1] += (int) canReduce;
                k -= canReduce;
            }
        }

        long ans = 0;
        for (int d = 1; d < freq.length; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}
