class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < min){
                secmin = min;
                min = price;
            }else if(price < secmin){
                secmin = price;
            }
        }
        int remaining = money - (min + secmin);
        if(remaining >= 0){
            return remaining;
        }
        return money;
    }
}