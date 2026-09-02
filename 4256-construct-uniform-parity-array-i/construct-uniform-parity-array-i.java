class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if (n <= 1) return true;
        
        int countOdd = 0;
        for (int num : nums1) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        
        // Can we make everything even?
        // - true if there are 0 odd numbers (nothing to fix)
        // - true if there are 2+ odd numbers (each odd can pair with another odd: odd - odd = even)
        boolean canAllEven = (countOdd == 0) || (countOdd >= 2);
        
        // Can we make everything odd?
        // - true if there is at least 1 odd number (every even can subtract that odd one: even - odd = odd)
        boolean canAllOdd = (countOdd >= 1);
        
        return canAllEven || canAllOdd;
    }
}