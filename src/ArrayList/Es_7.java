package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Es_7 {
    //controlla se c'è un oggetto, lo toglie nel caso e riordina la lista
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        // l.removeIf(n->(n=="verde"));
        if (l.contains("blu")) {
            System.out.println("ok, c'e'");
            l.remove("blu");
        } else {

            System.out.println("non c'e'");
        }
        Collections.sort(l);
        System.out.println(l);
    }


}
