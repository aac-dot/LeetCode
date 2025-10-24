// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode mdn = middleNode(head);

        while (mdn != null) {
            System.out.print(mdn.val + " ");
            mdn = mdn.next;
        }
    }

    public static ListNode middleNode(ListNode head) {

        if (head == null || head.next == null) return head;
        int treeSize = getTreeSize(head);
        int middleNodeLocation = (treeSize / 2) + 1;
        ListNode currentNode = head;

        int i = 1;
        

        while (i < middleNodeLocation) {
            currentNode = currentNode.next;
            i++;
        }

        return currentNode;
    }

    private static int getTreeSize(ListNode head) {
        int size = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        return size;
    }
}