package linkedList;


public class BasicLinkedList {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
    }
}
