package UnidadeII.LeetCode;

import UnidadeII.LeetCode.reverseList.ListNode;

public class DeleteNode {

    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
        }

    public void deleteNode(ListNode node) {
        ListNode p = node.next;
        node.val = p.val;
        node.next = p.next;
        p.next = null;
    }

    public static void main(String[] args) {
        
    }
}
