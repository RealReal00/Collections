package HashSet;

import java.util.*;

public class Es_1 {

    public static void main(String[] args) {
        //iteriamo l'hashset e determiniamo la dimensione e poi lo svuotiamo
       /* ArrayList<String> l = new ArrayList<String>();
        Set<String> l1 = new HashSet<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        l1.add("Rob");
        Set<String> l2 = new HashSet<>();
        l2.add("davide");
        l2.add("Ric");
        l2.add("daniele");
        Set<String> tmp = new HashSet<>(l1);
        tmp.retainAll(l2);

        Iterator<String> a = l1.iterator();

        while(a.hasNext()){
            System.out.println(a.next());
        }
        System.out.println("La dimensione e': " + l1.size());
        l1.removeAll(l1);
        System.out.println("La dimensione e': " + l1.size());*/
        List<Integer> s1 = new ArrayList<>();
        s1.add(1);
        s1.add(1);
        s1.add(2);
        String s="sdahgfakl";

        Es_1.firstRecurringCharacter(s);



    }

    public static List<Integer> removeDuplicates(List<Integer> l) {
       System.out.println(new ArrayList<>(new HashSet<>(l)));
       return new ArrayList<>(new HashSet<>(l));
    }

    public static  String firstRecurringCharacter(String s){


        System.out.println(s.toCharArray()[0]);
        System.out.println(s.toCharArray());
        return null;
    }

}
