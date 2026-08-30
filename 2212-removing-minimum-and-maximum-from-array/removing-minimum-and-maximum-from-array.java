class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;

        int i = 1;
        while (i < n) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
            i++;
        }
        int left = 0;
        int right = 0;
        if(minIndex < maxIndex){
            left = minIndex;
            right = maxIndex;
        }
        if(minIndex > maxIndex){
            left = maxIndex;
            right = minIndex;
        }
        int leftFront = right + 1;
        int rightFront = n - left;
        int countBoth = (left+1) + (n-right);

        int ans = leftFront;
        if(rightFront < ans){
            ans = rightFront;
        }
        if(countBoth < ans){
            ans = countBoth;
        }
        return ans;
    }
}