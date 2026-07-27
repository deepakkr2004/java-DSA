// class Solution {
//     public int maxProduct(int[] nums) {
//         Arrays.sort(nums);
//         int num1 = 0;
//         int num2 = 0;
//         for(int i=0; i<nums.length; i++){
//             num1 = nums[nums.length-1]-1;
//             num2 = nums[nums.length-2]-1;
//         }
//         return num1*num2;
//     }
// }


class Solution {
    public int maxProduct(int[] nums) {
        int num1 = 0;
        int num2 = 0;

        for(int num : nums){
            if(num > num1){
                num2 = num1;
                num1 = num;
            }else{
                if(num > num2){
                    num2 = num;
                }
            }
        }
        return (num1 -1) * (num2 - 1);
    }
}