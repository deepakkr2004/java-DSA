class Solution {
    public ListNode removeNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){

            list.add(head.val);
            head = head.next;

        }
        
        int n = list.size();

        ArrayList<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){

            if(list.get(i) >= max){

                ans.add(list.get(i));
                max = list.get(i);

            }
        }

        Collections.reverse(ans);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int val : ans){

            curr.next = new ListNode(val);
            curr = curr.next;

        }

        return dummy.next;
    }
}