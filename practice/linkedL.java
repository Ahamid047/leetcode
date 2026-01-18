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
        if(head == null){
            System.out.println("list is empty");
            return;   
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head =null;
            return;
        }
        Node secondLast= head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next=null;
    }
    public void reversell(){
        if(head ==null || head.next ==null){
            return;
        }
        Node prevNode =head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //UPDATE
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

    }

    public static void main(String[] args) {
        //Object
        linkedL list = new linkedL();
        list.addFirst("May");
        list.addLast("I");
        list.addLast("Come in");
        list.deleteFirst();
        list.deleteLast();
        list.printList();

    }
}
