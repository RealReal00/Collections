package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Es_3 {
    //scrivere un colore al primo elemento della lista
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        l.add(0, "giallo");
        System.out.println(l);
    }

}
