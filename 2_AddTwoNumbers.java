//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode (0);
        ListNode  res=head;
        int carry=0;
        int value=0;
        while(l1 !=null||l2 != null || carry !=0){
        {
            value=carry;
            if(l1 != null){
                value +=l1.val;
                l1=l1.next;
            }
             if(l2 != null){
                value +=l2.val;
                l2=l2.next;
            }
            int num=value%10;
            carry=value/10;
            head.next=new ListNode(num);
            head=head.next;
        }
        
        }
        return res.next;
    }
}