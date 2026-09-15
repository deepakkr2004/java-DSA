class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int key = i-j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(mat[i][j]);
            }
        }
        for(List<Integer> list : map.values()){
            Collections.sort(list);
        }
        for(int i=r-1; i>=0; i--){
            for(int j=c-1; j>=0; j--){
                int key = i-j;
                List<Integer> list = map.get(key);
                mat[i][j] = list.remove(list.size()-1);
            }
        }
        return mat;
    }
}