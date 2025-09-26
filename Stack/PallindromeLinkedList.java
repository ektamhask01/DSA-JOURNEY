import java.util.*;

public class PallindromeLinkedList {

    public static class Node{
        char data;
        Node next;
        public  Node(char data) {
            this.data= data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void addFirst(char data) {
          // step 1 . create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 . newNode -> next == head
        newNode.next = head;

        //  step 3 . head = newNode
        head = newNode;
        

    }

    public static boolean isPallindrome(PallindromeLinkedList list ) {
        Stack <Character> s = new Stack<>();
        Node temp = list.head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = list.head;
        while (temp != null  ) {
            if (temp.data != s.peek()) {
                return false;
            }
            temp = temp.next;
            s.pop();
        }

        return true;

    }


    public static void main(String[] args) {
        PallindromeLinkedList list = new PallindromeLinkedList();
        list.addFirst('A');
        list.addFirst('B');
        list.addFirst('C');
        list.addFirst('B');
        list.addFirst('A');
        System.out.println(list.isPallindrome(list)
);
    }

}