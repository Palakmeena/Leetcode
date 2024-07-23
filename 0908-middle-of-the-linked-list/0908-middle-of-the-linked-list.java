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
    public ListNode middleNode(ListNode head) {
        int size=0;
         ListNode temp=head;
      while(temp!=null ){
        size++;
        temp=temp.next;
         }
         temp=head;
        
        
        int middle=size/2;

        while(middle>0){
            
            temp=temp.next;
            middle--;

        }
        return temp;
        
    }
}