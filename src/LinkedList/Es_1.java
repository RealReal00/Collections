package LinkedList;

import java.util.*;

public class Es_1 {
//riscrivere la lista in ordine diverso e aggiungiamo un elemento alla fine e all'inizio
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        System.out.println(l1);
        Iterator it = l1.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        l1.addFirst("Sab");
        l1.addLast("Sab");
        l1.offerFirst("bho");
        l1.addFirst("primo");
        System.out.println(l1);


    }
}
