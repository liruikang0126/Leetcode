package Reverse_Linked_List_206;

public class Solution {
    /*
    Given the head of a singly linked list, reverse the list, and return the reversed list.
     */
    public static ListNode reverseList(ListNode head) {
        ListNode curr = new ListNode();
        while (head != null) {
            ListNode next = head.next;
            head.next = curr.next;
            curr.next = head;
            head = next;
        }
        return curr.next;
    }
}
