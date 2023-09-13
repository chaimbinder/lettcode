/**
 * Node
 */
public class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }

  public static Node rotateRight(Node head, int k) {
    if (head == null || k == 0) {
        return head;
    }

    int length = 1;
    Node tail = head;
    while (tail.next != null) {
        tail = tail.next;
        length++;
    }

    k = k % length;
    System.out.println("k  : " + k );
    if (k == 0) {
        return head; 
    }

    int newHeadPosition = length - k;
    Node newTail = head;
    for (int i = 1; i < newHeadPosition; i++) {
        newTail = newTail.next;
    }

   
    Node newHead = newTail.next;
    newTail.next = null;
    tail.next = head;

    return newHead;
}

  public static void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node temp = new Node(1);
    temp.next = new Node(2);
    temp.next.next = new Node(3);
    temp.next.next.next = new Node(4);
    temp.next.next.next.next = new Node(5);
    temp.next.next.next.next.next = new Node(6);

    System.out.print("Original list: ");
    printList(temp);

    Node reversed = rotateRight(temp,7);

    System.out.print("Reversed list: ");
    printList(reversed);
  }
}
