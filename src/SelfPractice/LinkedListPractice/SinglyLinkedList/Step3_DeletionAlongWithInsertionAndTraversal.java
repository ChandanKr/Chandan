package SelfPractice.LinkedListPractice.SinglyLinkedList;

public class Step3_DeletionAlongWithInsertionAndTraversal {
    Node head = null;
    int size = 0;

    //traversing each element, printing each of them
    // and printing the size of list whenever 'traverse()' function called.
    public void traverse(){
        if(head == null){
            System.out.println("Empty List, Doesn't have any single data in the list.\n");
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

    public void delete(int position){
        System.out.println("Deleting the Node present at position "+position);
        if(head == null){
            System.out.println("Sorry, can't delete as the list is already EMPTY\n");
        }
        else if(position < 1 || position > size){
            System.out.println("Sorry,unable to delete as you can only delete between 1 to "+size+"\n");
        }
        else{
            Node temp = head;
            if(position == 1){
                head = temp.next;
                temp.next = null;
            }
            else{
                for(int i = 1; i < position-1; i++){
                    temp = temp.next;
                }

                Node dN = temp.next;
                temp.next = dN.next;
                dN.next = null;
            }
            System.out.println("Node at position "+position+" has been successfully deleted.\n");
            size -= 1;
        }
    }

    //main function
    public static void main(String[] args) {
        Step3_DeletionAlongWithInsertionAndTraversal sll = new Step3_DeletionAlongWithInsertionAndTraversal();
        sll.traverse();

        sll.delete(1);

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

        sll.delete(1);
        sll.traverse();

        sll.delete(7);

        sll.delete(4);
        sll.traverse();

        sll.delete(2);
        sll.traverse();

        sll.delete(3);
        sll.traverse();

        sll.delete(1);
        sll.traverse();

        sll.delete(2);
        sll.traverse();

        sll.delete(1);
        sll.traverse();

        sll.delete(1);

        System.out.println("ALL OPERATIONS OF SINGLY LINKED LIST HAS BEEN COVERED NOW: CHANDAN");
    }
}
