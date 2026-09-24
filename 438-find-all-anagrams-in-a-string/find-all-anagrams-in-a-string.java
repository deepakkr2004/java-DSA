class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        int[] pCount = new int[26];
        for(char ch : p.toCharArray()){
            pCount[ch - 'a']++;
        }
        for(int i=0; i<=n-m; i++){
            int[] sCount = new int[26];
            for(int j=i; j<i+m; j++){
                sCount[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(pCount, sCount)){
                list.add(i);
            }
        }
        return list;
    }
}