package LeetMergeTwoSorted;

import java.util.ArrayList;

public class MergeTwoSorted {
    public static void main(String[] args) {
        ListNode list1[] = new ListNode();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<ListNode> result = new ArrayList<ListNode>();
        ListNode node = list1;
        while(node.next != null) {
            result.add(node);
            node = node.next;
        }

        node = list2;
        while(node.next != null) {
            result.add(node);
            node = node.next;
        }

        for (ListNode lNode : result) {
            System.out.println(lNode.val);
        }

        return new ListNode();
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
    
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
