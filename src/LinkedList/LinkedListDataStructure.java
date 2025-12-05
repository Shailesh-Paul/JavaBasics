package LinkedList;

class Node{ //userDefined data type
    int val;
    Node next;
    Node(int val){
        this.val=val;

    }
}

class Linkedlist{  //user defined data structure

    Node head;   //null
    Node tail;  //null
    int size;

    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null)  head =tail=temp;
        else{
            temp.next=head;
            head=temp;


        }
        size++;

    }

    public void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;

        }
        head=head.next;
        if(head==null) tail=null;
        size--;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;

    }

    public void display() {
        if(head==null) return;
        Node temp= head;
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp= temp.next;

        }
        System.out.println();
    }


    public void insert(int val, int idx) {
        if(idx<0 || idx> size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp= head;
            for(int i=1; i<=idx; i++){
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }


    public void delete(int idx){

        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1; i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next= temp.next.next;
        if(idx== size-1) tail=temp;     // we are deleting tail
        size--;
    }

}



public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll =new Linkedlist();
        ll.addAtTail(10); ll.display();

        ll.addAtTail(20);  ll.display();
        ll.addAtTail(30);  ll.display();
        ll.addAtTail(40);  ll.display();
        

        ll.addAtHead(50); ll.display();
        ll.addAtHead(55); ll.display();

        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);
        ll.insert(45,2); ll.display();
    }
}
