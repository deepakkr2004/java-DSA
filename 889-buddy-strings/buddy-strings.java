class Solution {
    public boolean checkFreq(String s){
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;

            if (arr[ch - 'a'] > 1) {
                return true;
            }
        }
        return false;
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return checkFreq(s);
        }
        ArrayList<Integer> freq = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                freq.add(i);
            }
        }
        if(freq.size() != 2){
            return false;
        }
        char[] arr = s.toCharArray();
        char temp = arr[freq.get(0)];
        arr[freq.get(0)] = arr[freq.get(1)];
        arr[freq.get(1)] = temp;

        return new String(arr).equals(goal);
    }
}