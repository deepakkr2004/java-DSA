//brutforce
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head.next==null || head.next.next==null) return;

//         ArrayList<ListNode> list = new ArrayList<>();

//         ListNode curr = head;
//         while(curr != null){
//             list.add(curr);
//             curr = curr.next;
//         }

//         int left = 0;
//         int right = list.size()-1;

//         while(left < right){
//             list.get(left).next = list.get(right);
//             left++;

//             if(left == right){
//                 break;
//             }
//             list.get(right).next = list.get(left);
//             right--;
//         }
//         list.get(left).next = null;
//     }
// }

//optimize way
class Solution {
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null) return;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode sec = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = sec;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first = head;
        sec = prev;

        while(sec != null){
            ListNode next1 = first.next;
            ListNode next2 = sec.next;

            first.next = sec;
            sec.next = next1;

            first = next1;
            sec = next2;
        }
    }
}