package Middle_of_the_LinkedList_876;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleNodeTest {
    @Test
    public void testMiddleNode() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode middleNode = Solution.middleNode(head);
        assertEquals(4, middleNode.val);
    }

}
