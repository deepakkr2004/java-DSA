class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int best = 0;
        for(int num : set){
            if(set.contains(num - 1)) continue;
            int len = 1;
            int curr = num;
            while(set.contains(curr + 1)){
                len++;
                curr++;
            }
            best = Math.max(best, len);
        }
        return best;
    }
}