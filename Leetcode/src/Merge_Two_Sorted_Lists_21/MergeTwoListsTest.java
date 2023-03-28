package Merge_Two_Sorted_Lists_21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoListsTest {
    @Test
    public void mergeTwoListsTest() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);
        ListNode actual = new Solution().mergeTwoLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void mergeTwoListsTest2() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode expected = new ListNode();
        ListNode actual = new Solution().mergeTwoLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void mergeTwoListsTest3() {
        ListNode list1 = new ListNode(1);
        ListNode list2 = null;
        ListNode expected = new ListNode(1);
        ListNode actual = new Solution().mergeTwoLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void mergeTwoListsTest4() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(1);
        ListNode expected = new ListNode(1);
        ListNode actual = new Solution().mergeTwoLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void mergeTwoListsTest5() {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        ListNode actual = new Solution().mergeTwoLists(list1, list2);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
