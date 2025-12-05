package QUEUE;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}

public class MyQueue {

    Node head= null;
    Node tail=null;
    int size;

    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
        }
        return head.val;
    }


    int remove(){
        int front = head.val;
        if(size==0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        head= head.next;
        size--;
        System.out.println();
        return front;

    }


    void add(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
