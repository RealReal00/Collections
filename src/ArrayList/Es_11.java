package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Es_11 {
    //swappare un elemento di una lista e unire le due liste e clonare una lista in un altra
        public static void main(String[] args) {
            List<String> l = new ArrayList<String>();
            List<String> l2 = new ArrayList<String>();


            l.add("blu");
            l.add("rosso");
            l.add("arancione");
            l.add("verde");

            l2.add("1");
            l2.add("2");
            l2.add("blu");
            l2.add("4");

            //System.out.println(l);
            //Collections.swap(l,1,2);
            System.out.println(l);

            //usiamo addAll per concatenare
            ArrayList<String> l3 = new ArrayList<String>();
            l3.addAll(l);
            l3.addAll(l2);
           // System.out.println(l3);

            ArrayList<String> l4 = new ArrayList<String>();
            l4=(ArrayList<String>)((ArrayList<String>) l).clone();
            System.out.println("clonaggio");

            System.out.println(l4);



        }

}
