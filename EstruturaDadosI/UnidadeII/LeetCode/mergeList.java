package UnidadeII.LeetCode;

public class mergeList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;

        if (list1 == null) {
            return null;
        }

        if (list1.val < list2.val) {
            head = list1;
        } else{
            head = list2;
        }

        ListNode newlist = new ListNode(head.val, null);

        while (list1 != null) {
            if (list1.val < list2.val) {
                
                newlist.next = list1;
                newlist.next.next = list2;
    
            } else{
                newlist.next = list2;
                newlist.next.next = list1;
            }

            list1 = list1.next;
            list2 = list2.next;
        }
        
        return newlist;
    }
}
