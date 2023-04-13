package Queue;

import java.util.PriorityQueue;

public class Es_4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q.add(3);
        q.add(2);
        q.add(1);

        q1.add(3);
        q1.add(2);
        q1.add(1);
        q1.add(4);

        for(Integer i : q1 ){
            if(q.contains(i)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");

            }
        }

       System.out.println( q.toString());
    }
}
