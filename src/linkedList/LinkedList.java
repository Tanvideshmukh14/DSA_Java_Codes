package linkedList;

public class LinkedList {
    Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if (head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
    return size;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst("a");
        ll.addFirst("is");

        ll.addLast("list");
        ll.addFirst("this");

        ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        ll.addFirst("this");
        System.out.println(ll.getSize());
    }
}
