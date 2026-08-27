class Solution {
    public int maximumSum(int[] nums) {
        ArrayList<Integer>[] group = new ArrayList[3];
        for(int i=0; i<3; i++){
            group[i] = new ArrayList<>();
        }
        for(int num : nums){
           int m = num % 3;
           group[m].add(num);
        }
        for(int i=0; i<3; i++){
            Collections.sort(group[i]);
        }
        
        int ans = 0;
        
        if(group[0].size() >= 3){
            int n = group[0].size();
            int sum = group[0].get(n-1)+group[0].get(n-2)+group[0].get(n-3);
            ans = Math.max(ans, sum);
        }
         if(group[1].size() >= 3){
            int n = group[1].size();
            int sum = group[1].get(n-1)+group[1].get(n-2)+group[1].get(n-3);
            ans = Math.max(ans, sum);
        }
         if(group[2].size() >= 3){
            int n = group[2].size();
            int sum = group[2].get(n-1)+group[2].get(n-2)+group[2].get(n-3);
            ans = Math.max(ans, sum);
        }
         if((group[0].size() >= 1) && (group[1].size() >= 1) && (group[2].size() >= 1)){
            int n0 = group[0].size();
            int n1 = group[1].size();
            int n2 = group[2].size();

            int sum = group[0].get(n0-1)+group[1].get(n1-1)+group[2].get(n2-1);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}


//through sliding window approach only 109 out of 172 test cases will run
// class Solution {
//     public int maximumSum(int[] nums) {
     
//         int left = 0;
//         int sum = 0;
//         int ans = 0;

//         for (int right = 0; right < nums.length; right++) {

//             sum += nums[right];

//             if (right - left + 1 == 3) {

//                 if (sum % 3 == 0) {
//                     ans = Math.max(ans, sum);
//                 }

//                 sum -= nums[left];
//                 left++;
//             }
//         }

//         return ans;
//     }
// }