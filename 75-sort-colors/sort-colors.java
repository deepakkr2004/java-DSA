class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length-1;
        int i = 0;
        int j = 0;
        int k = n;
        while(j<=k){
            if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }else if(nums[j] == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
    }
}