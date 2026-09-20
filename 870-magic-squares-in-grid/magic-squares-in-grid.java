class Solution {
    private boolean isMagicGrid(int[][] grid, int r, int c){
        
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int num = grid[r+i][c+j];
                if(num < 1 || num > 9 || set.contains(num)){
                    return false;
                }else{
                    set.add(num);
                }
            }
        }

        int SUM = grid[r][c] + grid[r][c+1] + grid[r][c+2];

        for(int i=0; i<3; i++){
            if(grid[r+i][c] + 
                grid[r+i][c+1] + 
                grid[r+i][c+2] != SUM){
                return false;
            }
            if(grid[r][c+i] + 
                grid[r+1][c+i] + 
                grid[r+2][c+i] != SUM){
                return false;
            }
        }
        if(grid[r][c] + 
            grid[r+1][c+1] +  
            grid[r+2][c+2] != SUM){
            return false;
        }
        if(grid[r][c+2] + 
            grid[r+1][c+1] + 
            grid[r+2][c] != SUM){
            return false;
        }
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0; i<=row-3; i++){
            for(int j=0; j<=col-3; j++){
                if(isMagicGrid(grid, i, j)){
                    count++;
                }
            }
        }
        return count;
    }
}