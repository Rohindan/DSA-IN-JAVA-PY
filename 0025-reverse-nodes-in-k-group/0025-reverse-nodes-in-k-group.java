/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevTail = null;
        ListNode newHead = null;

        ListNode curr = head;
        while(curr != null){

            ListNode temp = curr;
            int count = 0;

            while(temp != null && count < k){
                temp = temp.next;
                count++;
            }

            if(count < k){
                if(prevTail != null){
                    prevTail.next = curr;
                }
                break;
            }


            ListNode groupHead = curr;
            ListNode prev = null;

            for(int i = 0; i < k; i++){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if(newHead == null){
                newHead = prev;
            }
            else{
                prevTail.next = prev;
            }

            prevTail = groupHead;

        }

        return newHead;
    }
}