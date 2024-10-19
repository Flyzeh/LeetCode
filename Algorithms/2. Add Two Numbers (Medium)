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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultat = new ListNode(0); 
        ListNode current = resultat; 
        int indice = 0; 

        while (l1 != null || l2 != null) {
            int somme = indice; 

            if (l1 != null) {
                somme += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                somme += l2.val;
                l2 = l2.next;
            }

            indice = somme / 10; 
            current.next = new ListNode(somme % 10); 
            current = current.next; 
        }

        if (indice > 0) {
            current.next = new ListNode(indice);
        }

        return resultat.next; 
    }
}
