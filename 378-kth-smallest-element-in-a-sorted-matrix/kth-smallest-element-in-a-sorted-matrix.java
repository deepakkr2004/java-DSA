class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // store all elements of the mat into the array
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr.add(matrix[i][j]);
            }
        }

        // sort the array
        Collections.sort(arr);

        // return the kth smallest element 
        // (0-based index, hence k-1)
        return arr.get(k - 1);
    }
}