package UnidadeII.LeetCode;

public class palindromo {
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

    public boolean isPalindrome(ListNode head) {
      
        if (head == null) {
            return false;
        }
        //inverte
        ListNode nova = new ListNode(head.val, null);

        ListNode head2 = head;

        while (head != null ) {
            nova = new ListNode(head.val, nova);
            head = head.next;
        }

        while (head2 != null) {
            if (nova.val != head2.val) {
                return false;
            }

            head2 = head2.next;
            nova = nova.next;
        }

       return true;
    }

    public static void main(String[] args) {

    }
}
