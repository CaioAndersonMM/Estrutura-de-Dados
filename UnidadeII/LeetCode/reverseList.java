package UnidadeII.LeetCode;

public class reverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
            //ListNode head;
            //ListNode tail;
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        //ListNode p = head;
        ListNode nova = head;

        while (head != null ) {
            head = head.next;
            nova.next = head;
        }

        return nova;
        

    }

    public static void main(String[] args) {
    }
}
