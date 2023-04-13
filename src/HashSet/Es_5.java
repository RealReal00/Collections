package HashSet;

import java.util.HashSet;

public class Es_5 {
    public static void main(String[] args) {
        HashSet<String> l1 = new HashSet<String>();
        HashSet<String> l2 = new HashSet<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");

        l2.add("Eli");
        l2.add("Jack");
        l2.add("Monica");

       for(String element : l2) {
           if (l1.contains(element)) {
               System.out.println("Yes");
           }
           else {
               System.out.println("No");

           }
       }

    }
}
