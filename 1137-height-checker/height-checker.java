// class Solution {
//     public int heightChecker(int[] heights) {
//         int[] need = heights.clone();
//         Arrays.sort(need);
//         int count = 0;
//         for(int i=0; i<heights.length; i++){
//             if(need[i] != heights[i]){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

//through bubble sort
class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();

        for (int i = 0; i < expected.length - 1; i++) {
            for (int j = 0; j < expected.length - 1 - i; j++) {

                if (expected[j] > expected[j + 1]) {
                    int temp = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = temp;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                ans++;
            }
        }

        return ans;
    }
}