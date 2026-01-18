package practice;

public class linkedL {

    class Node {

        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        //Object
        linkedL list = new linkedL();
        list.addFirst("May");
        list.addFirst("I");
        list.printList();

    }
}
