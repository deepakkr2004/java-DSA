class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
       
        while(curr != null){

            int greater = 0;
            ListNode temp = curr.next;

            while(temp != null){
                if(temp.val > curr.val){
                    greater = temp.val;
                    break;
                }
                temp = temp.next;
            }
            list.add(greater);
            curr = curr.next;
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}