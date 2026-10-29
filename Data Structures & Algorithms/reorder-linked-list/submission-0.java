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
     public void reorderList(ListNode head) {

         // Step 1: Find the middle of the linked list
         ListNode slow = head;
         ListNode fast = head;

         while (fast.next != null && fast.next.next != null) {
             slow = slow.next;
             fast = fast.next.next;
         }

         // Step 2: Reverse the second half of the linked list
         ListNode second = slow.next;
         slow.next = null;

         ListNode prev = null;

         while (second != null) {
             ListNode next = second.next;
             second.next = prev;
             prev = second;
             second = next;
         }

         // Step 3: Merge the two halves alternately
         ListNode first = head;
         second = prev;

         while (second != null) {
             ListNode nextFirst = first.next;
             ListNode nextSecond = second.next;

             first.next = second;
             second.next = nextFirst;

             first = nextFirst;
             second = nextSecond;
         }
     }
 }