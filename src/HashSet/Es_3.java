package HashSet;

import java.util.HashSet;

public class Es_3 {
    //convertire un HashSet in un Array

    public static void main(String[] args) {
        HashSet<String> l1 = new HashSet<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        System.out.println(l1);
        String[] a = new String[l1.size()];
        l1.toArray(a);
        for(String element : a){
            System.out.println(a);

        }

    }

}
