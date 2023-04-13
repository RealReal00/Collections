package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Es_10 {
    //estrarre una porzione della lista
    public static void main(String[] args){
        List<String> l = new ArrayList<String>();
        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");


        System.out.println("lista originale" + l);
        //adesso estraiamo una porzione di lista
        List<String> porzione = l.subList(0,3);
        System.out.println("lista primi tre elementi" + porzione);


    }
}
