class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0;
        int left = 0;
        int right = n-1;
        int down = n-1;

        int count = 1;
        while(top <= down && left <= right){
            for(int i=left; i<=right; i++){
                matrix[top][i] = count++;
            }
            top++;

            for(int j=top; j<=down; j++){
                matrix[j][right] = count++;
            }
            right--;

            if(top <= down){
                for(int i=right; i>=left; i--){
                    matrix[down][i] = count++;
                }
                down--;
            }

            if(left <= right){
                for(int i=down; i>=top; i--){
                    matrix[i][left] = count++;
                }
                left++;
            }
        }
        return matrix;
    }
}