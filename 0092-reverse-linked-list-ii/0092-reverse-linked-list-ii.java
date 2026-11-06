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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null) return head;
        if(left == 1 && right == 1){
            return head;
        }

        ListNode first = head;
        ListNode last = head;
        for(int i = 0; i < left - 1; i++){
            first = first.next;
        }
        for(int i = 0; i < right - 1; i++){
            last = last.next;
        }

        while(left <= right){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;

            first = first.next;

            ListNode tempo = head;
            while(tempo.next != last){
                tempo = tempo.next;
            }

            last = tempo;
            
            left++;
            right--;
        }

        return head;
    }
}