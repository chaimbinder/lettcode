/**
 * ListNode
 */

public class ListNode {
  int data;
  ListNode next;

  ListNode(int d) {
    data = d;
    next = null;
  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    ListNode prev = null;
    while (current != null) {
      if (prev != null && prev.data == current.data) {
        prev.next = current.next;
      } else {
        prev = current;
      }
      current = current.next;
    }
    return head;
  }

  public static void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    ListNode temp = new ListNode(1);
    temp.next = new ListNode(2);
    temp.next.next = new ListNode(2);
    temp.next.next.next = new ListNode(4);
    temp.next.next.next.next = new ListNode(6);
    temp.next.next.next.next.next = new ListNode(6);

    System.out.print("Original list: ");
    printList(temp);

    ListNode reversed = deleteDuplicates(temp);

    System.out.print("Reversed list: ");
    printList(reversed);
  }
}
