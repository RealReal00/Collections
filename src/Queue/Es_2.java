package Queue;

import java.util.*;

public class Es_2 {
    public static void main(String[] args) {
        //similarità e differenze tra queue e set
        Set<Integer> q = new TreeSet<Integer>();
        Queue<Integer> q1 = new PriorityQueue<Integer>();
        q.add(3) ;
        q.add(2);
        q.add(1);
        q.add(77);
        q.add(7);

        q1.add(3) ;
        q1.add(2);
        q1.add(1);
        q1.add(77);
        q1.add(7);

        for(int i : q){
            System.out.println(i);
        }
        System.out.println("****");
        for(int i : q1){
            System.out.println(i);
        }
    }
}
