package Week22;

public class RemoveDuplicatesFromLL {

    /**
     * Question # 17
     * Description: Remove Duplicates From Linked List
     * Difficulty: Easy Category: Linked Lists
     * You're given the head of a Singly Linked List whose nodes are in sorted order with respect to
     * their values. Write a function that returns a modified version of the Linked List that doesn't
     * contain any nodes with duplicate values. The Linked List should be modified in place (i.e.,
     * you shouldn't create a brand-new list), and the modified Linked List should still have its
     * nodes sorted with respect to their values. Each LinkedList node has an integer value as well
     * as a next node pointing to the next node in the list or to None / null if it's the tail of the list.
     * Sample Input
     * linkedList = 1 -> 1 -> 3 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 // the head node with value 1
     * Sample Output 1 -> 3 -> 4 -> 5 -> 6 // the head node with value 1
     */
    /*
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    83. Remove Duplicates from Sorted List
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.
    Input: head = [1,1,2]
    Output: [1,2]
    Input: head = [1,1,2,3,3]
    Output: [1,2,3]
     */
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3)))));

        ListNode head3 = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4)))))));

        printList(head1);
        printList(twoPointer(head1));

        printList(head2);
        printList(twoPointer(head2));

        printList(head3);
        printList(twoPointer(head3));
    }

    // time complexity : O(n)
    public static ListNode twoPointer(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if (slow.val == fast.val) {
                fast = fast.next;
                slow.next = fast;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates3(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "  ");
            current = current.next;
        }
        System.out.println();
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
