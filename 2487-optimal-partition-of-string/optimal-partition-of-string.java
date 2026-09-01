// class Solution {
//     public int partitionString(String s) {
//         HashSet<Character> set = new HashSet<>();
//         int count = 1;
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(set.contains(ch)){
//                 count++;
//                 set.clear();
//             }
//             set.add(ch);
//         }
//         return count;
//     }
// }

class Solution {
    public int partitionString(String s) {
        int[] lastSeen = new int[26];
        int count = 0;
        Arrays.fill(lastSeen,-1);
        int currSubStart = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(lastSeen[ch - 'a'] >= currSubStart){
                count++;
                currSubStart = i;
            }
            lastSeen[ch -'a'] = i;
        }
        return count+1;
    }
}




//Unexpected solution only 15 out of 62 testcase will run
// class Solution {
//     public int partitionString(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         int max = 0;
//         for(int value : map.values()){
//             if(value>max){
//                 max += Math.max(max,value);
//             }
//         }
//         return max;
//     }
// }