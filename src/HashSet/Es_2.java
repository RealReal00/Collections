package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Es_2 {
    public static void main(String[] args) {
        HashSet<String> l1 = new HashSet<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        System.out.println((l1));

        HashSet<String> l2 = new HashSet<String>();
        l2=(HashSet)l1.clone();
        System.out.println((l2));
    }
}
