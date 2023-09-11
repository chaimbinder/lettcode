/**
 * Node
 */
import java.util.Stack;

public class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }

  public static Node reverseBetween(Node head, int m, int n) {
    if (head == null || m == n) {
      return head;
    }

    Node dummy = new Node(0);
    dummy.next = head;
    Node prev = dummy;

    for (int i = 1; i < m; i++) {
      prev = prev.next;
    }
      
    Stack<Node> stack = new Stack<>();
     
    Node current = prev.next;
   
    for (int i = m; i <= n; i++) {
      stack.push(current);
      current = current.next;
        
    }
  
    while (!stack.isEmpty()) {
      prev.next = stack.pop();
      prev = prev.next;
    }

    prev.next = current;

    return dummy.next;
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

    Node reversed = reverseBetween(temp, 2, 4);
    
    System.out.print("Reversed list: ");
    printList(reversed);
  }
}
