class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int result = 0;
        for(int freq : map.values()){
            if(freq == 1){
                return -1;
            }
            result += Math.ceil( (double) freq/3);
        }
        return result;
    }
}