public class reverseLL {

    //https://leetcode.com/problems/reverse-linked-list/

    //Recursion

    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head;
        }

        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr)
    {
        if(curr == null)
        {
            return prev;
        }

        ListNode nextNode = curr.next;
        curr.next = prev;
        return reverse(curr, nextNode);
    }

    //Iterative

    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return head;
        }

        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode curr)
    {
        if(curr == null)
        {
            return prev;
        }

        ListNode nextNode = curr.next;
        curr.next = prev;
        return reverse(curr, nextNode);
    }
}
