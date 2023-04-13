package LinkedList;

import java.util.LinkedList;

public class Es_2 {
    public static void main(String[] args) {
        //rimuovere e ritornare il primo elemento della lista, con peekFirst preleviamo il primo elemento senza
        // rimuoverlo
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        l1.add("Sam");
       // System.out.println(l1.pop());
        System.out.println(l1.getFirst());
        String x= l1.peekFirst();
        System.out.println(x);

    }

    }
