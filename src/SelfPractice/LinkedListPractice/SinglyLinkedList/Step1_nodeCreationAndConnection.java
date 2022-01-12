package SelfPractice.LinkedListPractice.SinglyLinkedList;


class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
public class Step1_nodeCreationAndConnection {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;
        c.next = null;

        System.out.println(a.data);
        System.out.println(a.next);
        System.out.println(b.data);
        System.out.println(b.next);
        System.out.println(c.data);
        System.out.println(c.next);
        System.out.println(a.next.data);
        System.out.println(a.next.next);
        System.out.println(b.next.data);
        System.out.println(b.next.next);

        System.out.println(a.data+" "+a.next.data+" "+a.next.next.data);
    }
}
