import util.ListNode;

public class DeleteNodeInALinkedList {
    // inplace list modify O(n)
    public void deleteNode(ListNode node) {
        ListNode pre = null;
        while (node.next != null){
            node.val = node.next.val;
            pre = node;
            node = node.next;
        }
        // The input is not a tail
        // so pre is not null
        pre.next = null;
    }
}
