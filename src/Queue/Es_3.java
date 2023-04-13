package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Es_3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(3);
        q.add(2);
        q.add(1);
       /* Iterator<Integer> i = q.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/
        for(Integer i : q){
            System.out.println(i);

        }
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.addAll(q);
        System.out.println(q1);


    }
}
