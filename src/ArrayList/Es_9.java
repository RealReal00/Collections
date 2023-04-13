package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Es_9 {
    //facciamo lo shuffle,reverse
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        System.out.println(l);

        Collections.shuffle(l);
        System.out.println(l);

        Collections.reverse(l);


        System.out.println(l);


    }
}
