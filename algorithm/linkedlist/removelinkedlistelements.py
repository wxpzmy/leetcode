# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class RemoveLinkedListElements:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        if not head:
            return None
        pre = None
        newhead = cur = head
        
        while cur:
            if cur.val is val:
                if pre:
                    pre.next = cur.next
                    cur = pre.next
                else:
                    tmp = cur.next
                    cur.next = None
                    newhead = cur = tmp
            else:
                pre = cur
                cur = cur.next
                
        return newhead
