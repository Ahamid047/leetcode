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
    public void addLast(String data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next=newNode;
        
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
        list.addLast("I");
        list.addLast("Come in");
        list.printList();

    }
}
