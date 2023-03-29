package Linked_List_Cycle_II_142;

import java.util.HashMap;

public class Solution {
    /*
    Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
    There is a cycle in a linked list if there is some node in the list that can be reached again
    by continuously following the next pointer.
    Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
    Note that pos is not passed as a parameter. Notice that you should not modify the linked list.
     */
    public static ListNode detectCycle(ListNode head) {
        if (head != null && head.next != null) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    slow = head;
                    while (fast != slow) {
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return slow;
                }
            }
        }
        return null;
    }
}
