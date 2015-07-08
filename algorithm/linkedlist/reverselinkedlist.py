# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

from util.listnode import ListNode

class ReverseLinkedList:
    # @param {ListNode} head
    # @return {ListNode}
    def reverseList(self, head):
        if not head:
            return None
        cur = head
        nextnode = cur.next
        
        while cur and nextnode:
            tmp = nextnode.next
            nextnode.next = cur
            if cur is head:
                cur.next = None
            cur = nextnode
            nextnode = tmp
            
        return cur
