# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: ListNode | None, k: int) -> ListNode | None:
        
        prevTail = None
        newHead = None

        curr = head
        while curr != None:

            temp = curr
            count = 0

            while temp != None and count < k:
                temp = temp.next
                count += 1
            
            if count < k:
                if prevTail != None:
                    prevTail.next = curr
                break
            
            groupHead = curr
            prev = None
            for i in range(k):
                nextNode = curr.next
                curr.next = prev
                prev = curr
                curr = nextNode
            
            if newHead == None:
                newHead = prev
            else:
                prevTail.next = prev
            
            prevTail = groupHead

        return newHead



