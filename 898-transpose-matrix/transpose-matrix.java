class Solution {
    public int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] temp = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[j][i] = matrix[i][j];
            }
        }

        return temp;
    }
}

//only for square matrix
// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int n = matrix.length;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         return matrix;
//     }
// }