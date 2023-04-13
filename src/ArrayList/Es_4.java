package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Es_4 {
    //ottenere un elemento
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        System.out.println(l.get(0));
        String element;
        element=l.get(1);
        System.out.println("il secondo elemento e': " + element);
    }

    }
