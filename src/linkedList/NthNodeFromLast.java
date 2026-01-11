package linkedList;

import java.util.Scanner;

class Node{
    int data;
    Node link;
}
public class NthNodeFromLast {

    static Node head = null;
    static Scanner Input = new Scanner(System.in);

    public static Node createNode(){
        return new Node();
    }

   public static void insertNode(){
        Node temp = createNode();
        System.out.println("Enter the element to be inserted");
        temp.data = Input.nextInt();
        temp.link = null;

        if(head == null){
            head = temp;
        }else{
            Node ptr = head;
            while(ptr!=null){
                ptr = ptr.link;
            }
            ptr.link = temp;
        }
   }
   public static void deleteNode(){
        if (head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.link;
        }
   }
    public static Node FindNthNode(int n){
        if(head.link == null){
            return null;
        }
        Node curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.link;
            size++;
        }
        if(n == size){
            return head.link;
        }
        Node prev = head;
        int counter = size - n;
        size = 1;
        while(size < counter){
            prev = prev.link;
            size ++;
        }
       prev.link = prev.link.link;
        return head;
    }
    public static void main(String[] args) {

    }
}
