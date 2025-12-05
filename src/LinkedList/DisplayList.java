package LinkedList;
//class Node {
//    int val;
//    Node next; //null
//
//    Node(int val) {
//        this.val = val;
//    }
//}

public class DisplayList {
    public static  void display(Node head){

//        System.out.println(head.val+" ");
//        System.out.println(head.next.val+" ");
//        System.out.println(head.next.next.val+" ");
//        System.out.println(head.next.next.next.val+" ");
//        System.out.println(head.next.next.next.next.val+" ");
//        System.out.println(head.next.next.next.next.next.val+" ");

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();




    }
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(200);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f= new Node(5);


        a.next= b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
    display(a);
    }
}
