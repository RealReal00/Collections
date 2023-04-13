package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Es_5 {
    //modifcare un elemento
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        System.out.println(l);
        l.set(1, "indaco");
        System.out.println(l);

    }
}
