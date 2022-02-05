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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null; // base case
        
        ListNode head = new ListNode(0); // dummy node created & you can chose any value of your choice, I choose 0 "Because we indian invented that"
        ListNode temp = head;
        
        while(true){ // running infinite
            int p = 0; // point to list with minimum value
            for(int i = 0; i < lists.length; i++){
                if(lists[p] == null || (lists[i] != null && lists[p].val > lists[i].val)){
                p = i;
                }
            }
            if(lists[p] == null){ // it means no value present
                break;
            }
            temp.next = lists[p];
            temp = temp.next;
            lists[p] = lists[p].next;
        }
        return head.next;
    }
}