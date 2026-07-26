/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {


  ListNode dummpy=new ListNode(0);
  dummpy.next=head;
  ListNode fast=dummpy;
  ListNode slow=dummpy;
  for(int i=0;i<=n;i++){
    fast=fast.next;
  }
  while(fast!=null){
    fast=fast.next;
    slow=slow.next;
  }
slow.next=slow.next.next;




return dummpy.next;







    }
}
    //     ListNode temp =head;
       
    //     int size=0;
    //     while(temp!=null){
    //         temp=temp.next;
    //         size++;
    //     }
    //     if(n==size){
    //         head=head.next;
    //         return head;
    //     }
    //      ListNode prev=head;
    //     int i =1;
    //     int itoSize = size-n;
    //     while(i<itoSize){
    //         prev=prev.next;
    //         i++;
    //     }
    //         prev.next=prev.next.next;
    //         return head;
    //     }
    // }
