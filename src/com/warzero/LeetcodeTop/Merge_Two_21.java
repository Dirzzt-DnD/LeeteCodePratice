package com.warzero.LeetcodeTop;


import org.junit.jupiter.api.Test;

public class Merge_Two_21 {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }
        return dummyNode.next;
    }

    @Test
    public void test(){
        var l1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        var l2 = new ListNode(4,new ListNode(5,new ListNode(6)));
        mergeTwoLists(l1,l2);
    }

}
