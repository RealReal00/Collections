package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Es_1 {
    public static void main(String[] args) {
        // peek è il metodo che preleva l'ultimo elemento dalla lista senza rimuverlo
        //pool è l'elemento che estrae l'elemento dalla coda
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(3);
        q.add(2);
        q.add(1);


        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        /*
//questo sotto è l'equivalente di peek
        System.out.println(q.element());
        System.out.println(q.element());
        System.out.println(q.element());
        System.out.println(q.element());
//questo sotto è l'equivalente di pool
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

         */



    }
}
