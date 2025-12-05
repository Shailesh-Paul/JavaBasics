package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalOfQueue {

    private static void display(Queue<Integer> q){
        int n= q.size();
        for(int i=0; i<n;i++){
            System.out.println(q.peek() + " ");
            q.add(q.remove());

        }
        System.out.println();
    }


    public static void main(String[] args) {

//        Traverse krna hai ab
        Queue <Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
    display(q);
    addAtIdx(q, 3, 60);
    display(q);
peek(q, 3);
remove(q,4);



    }

    private static void addAtIdx(Queue<Integer> q,int idx , int val) {
        if(idx<0 || idx>q.size()){
            System.out.println("Invalid index");
            return;
        }
        int n= q.size();
        if(idx==n){
            for(int i=1;i<=idx;i++){
                q.add(q.remove());
            }
        }

            q.add(val);
        for(int i=1; i<=n-idx;i++){
            q.add(q.remove());
        }
}




private  static void peek(Queue<Integer> q,int idx){
        int n= q.size();
        if(idx<0 || idx>q.size()){
            System.out.println("Enter a valid index or Index Out of Bound");
                return ;
        }
    System.out.println(q);
        for(int i=1;i<idx;i++){
            q.add(q.remove());
        }

    System.out.println(q.peek());

}
private static void remove(Queue<Integer> q,int idx){

        int n= q.size();

        for(int i=0; i<idx;i++){
            q.add(q.poll());

        }

    System.out.println(q.poll() +' ');  

   int remaining = n-idx-1;
   for(int i=0;i<remaining;i++){
       q.add(q.poll());
   }

    System.out.println(q);


}

    }
