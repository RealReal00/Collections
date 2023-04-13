package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Es_6 {
    //rimuovi elemento
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");
        System.out.println(l);

        l.remove(2);

        System.out.println(l);


    }
}
