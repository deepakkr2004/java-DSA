class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int L = groupSizes[i];
            map.putIfAbsent(L, new ArrayList<>());
            map.get(L).add(i);
            if(map.get(L).size() == L){
                ans.add(new ArrayList<>(map.get(L)));
                map.put(L, new ArrayList<>());
            }
        }
        return ans;
    }
}