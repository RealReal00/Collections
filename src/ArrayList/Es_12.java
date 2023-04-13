package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Es_12 {
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");


        System.out.println(l);
        if(l.isEmpty()){
            System.out.println("yes");
        }
        else{

            System.out.println("no, quindi lo svuoto");
            l.removeAll(l);


        }
        if(l.isEmpty()){
            System.out.println("yes");
        }
        else{

            System.out.println("no, quindi lo svuoto");
            l.removeAll(l);


        }


    }
}
