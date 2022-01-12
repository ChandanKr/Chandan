package SelfPractice.LinkedListPractice.SinglyLinkedList;

/*
class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
*/

public class Step2_dataInsertionAndTraversal {
    Node head = null;
    int size = 0;

    //traversing each element, printing each of them
    // and printing the size of list whenever 'traverse()' function called.
    public void traverse(){
        if(head == null){
            System.out.println("Empty List, Doesn't have any single data in the list.");
        }
        else{
            Node currentNode = head;

            System.out.print("Current List: [ ");
            while(currentNode != null){
                System.out.print(currentNode.data+" ");
                currentNode = currentNode.next;
            }
            System.out.println("]");
            System.out.println("Current list size: "+size);
            System.out.println();
        }
    }

    //insertion at the very first position every time whenever "push()" function called.
    public void push(int data){
        System.out.println("Pushing "+data+" at position 1 in the list......");
        Node n = new Node(data);

        if(head != null){
            n.next = head;
        }
        head = n;
        size += 1;
    }

    //insertion after the last position every time whenever "append()" function called.
    public void append(int data){
        System.out.println("Inserting "+data+" at position "+(size+1));
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = n;
        }
        size += 1;
    }

    //inserting data in the given specific position when 'insertAtPosition()' function called.
    public void insertAtPosition(int position, int data){
        System.out.println("Inserting "+data+" at position "+position);
        if(position <= 0 || position > (size+1)){
            System.out.println("Sorry,unable to insert as you can only insert between 1 to "+(size+1)+"\n");
        }
        else{
            if(position == 1){
                push(data);
            }
            else if(position == (size+1)){
                append(data);
            }
            else{
                Node n = new Node(data);
                int currentPosition = 1;
                Node previousNode = head;

                while(currentPosition != (position-1)){
                    previousNode = previousNode.next;
                    currentPosition = currentPosition + 1;
                }

                n.next = previousNode.next;
                previousNode.next = n;
                size += 1;
            }
        }
    }

    //main function
    public static void main(String[] args) {
        Step2_dataInsertionAndTraversal sll = new Step2_dataInsertionAndTraversal();
        sll.traverse();

        sll.push(10);
        sll.traverse();

        sll.push(20);
        sll.traverse();

        sll.push(30);
        sll.traverse();

        sll.append(40);
        sll.traverse();

        sll.insertAtPosition(8,200);

        sll.insertAtPosition(1,50);
        sll.traverse();

        sll.insertAtPosition(6,60);
        sll.traverse();

        sll.insertAtPosition(5,70);
        sll.traverse();
    }
}
