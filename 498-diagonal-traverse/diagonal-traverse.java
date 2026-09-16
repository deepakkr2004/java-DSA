class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int key = i+j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        List<Integer> result = new ArrayList<>();
        boolean flip = true;
        for(List<Integer> list : map.values()){
            if(flip){
                Collections.reverse(list);
            }
            for(int num : list){
                result.add(num);
            }
            flip =! flip;
        }
        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}