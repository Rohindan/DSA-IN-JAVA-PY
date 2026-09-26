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
    public ListNode removeElements(ListNode head, int val) {
        
    
        //this while loop checks whether the starting point or node is the target or not
        // if starting node is the target then we remove head from first Node and move our head to point at second node 
        while(head != null && head.val == val){
            head = head.next;
        }

        //this line checks from second node 
        ListNode temp = head;
        while(temp != null && temp.next != null){  
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}