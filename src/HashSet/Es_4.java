package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Es_4 {
    //convertire un HashSet in un TreeSet, per farlo mettiamo come parametro la HashSet
    public static void main(String[] args) {
        HashSet<String> l1 = new HashSet<String>();
        l1.add("Monica");
        l1.add("Ric");
        l1.add("Rob");
        TreeSet<String> tree = new TreeSet<String>(l1);
    }
}
