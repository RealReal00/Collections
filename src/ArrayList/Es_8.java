package ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Es_8 {

    //copiare un Arrayliat in un altra e confrontare le due Arraylist per vedere se ci sono elementi uguali
    public static void main(String[] args){
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
        System.out.println(l);
        System.out.println(l2);

        //Collections.copy(l,l2);
       // System.out.println("dopo la copia");
        //System.out.println(l);

       // System.out.println(l2);
        System.out.println("passaggio al confronto liste");

        List<String> l3 = new ArrayList<String>();
       for(String e : l) {
           if(l2.contains(e)){
               l3.add(e);
           }
           else{
               continue;
           }
        }
       /* for(String e : l){
            l3.add(l2.contains(e) ? "Yes" : "No");
        }*/
        System.out.println(l3);

    }
}
