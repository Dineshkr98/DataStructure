package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDeclaration {
    public static void main(String[] args){
        PriorityQueue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("D");//Homogeneous
        System.out.println(q);
       // System.out.println(q.element());
        System.out.println(q.peek());
       // System.out.println(q.remove());
        //System.out.println(q.poll());
        q.remove("C");
        System.out.println(q);
    }
}
