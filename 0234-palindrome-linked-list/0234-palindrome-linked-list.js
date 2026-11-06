/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */

var midPoint = function(head) {
    let fast = head;
    let slow = head;
    while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }

    return slow;
}

var reverse = function(head) {
    let prev = null;
    let curr = head;
    while(curr != null){
        let next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}

var isPalindrome = function(head) {
    if(head == null || head.next == null){
        return true;
    }

    let mid = midPoint(head);
    let newHead = mid.next;
    mid.next = null;

    newHead = reverse(newHead);
    let c1 = head;
    let c2 = newHead;
    let result = true;
    while(c2 != null){
        if(c1.val != c2.val){
            result = false;
        }
        c1 = c1.next;
        c2 = c2.next;
    }
    newHead = reverse(newHead);
    mid.next = newHead;

    return result;
};