package linkedList;


public class BasicLinkedList {
    static class Node{
        static String data;
        static Node next;

        Node(String data){
            Node.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
      Node ll = new Node("10");

    }
}
