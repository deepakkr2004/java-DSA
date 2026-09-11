class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] ok = new boolean[1000];
        int count =0;
        for(int num=100; num<=998; num+=2){
            if(num % 2 != 0){
                continue;
            }

            int a = num/100;
            int b = (num/10) % 10;
            int c = num % 10;

            int[] freq = new int[10];
            for(int d : digits){
                freq[d]++;
            }
            if(freq[a]>0){
                freq[a]--;
            }else{
                continue;
            }
            if(freq[b]>0){
                freq[b]--;
            }else{
                continue;
            }
            if(freq[c]>0){
                ok[num] = true;
                count++;
            }
        }
        return count;
    }
}