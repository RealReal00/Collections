package ArrayList;
import java.util.*;

public class Es_1 {
    //creare un arraylist e mettere colori
    /*public static void main(String[] args){
        ArrayList<String> l = new ArrayList<String>();
        List<String> l1 = new ArrayList<String>();

        l.add("blu");
        l.add("rosso");
        l.add("arancione");
        l.add("verde");

        l1.add("blu");
        l1.add("rosso");
        l1.add("arancione");
        l1.add("verde");

        System.out.println(l1);

        System.out.println(l);


    }*/
    public static void main(String[] args){
        ArrayList<Integer> numeri = new ArrayList<>();
        Es_1.riempi(numeri,5);

    }
    public static void riempi(ArrayList<Integer> list, int value){
        list.add(0,value);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(666);
        list.set(3,1);
        list.remove(Integer.valueOf(666));
        if(list.contains(6)){

            System.out.println("si");
        }
       ArrayList<Integer> copia = new ArrayList<>();
        for(int item : list){
            copia.add(item);
        }
        System.out.println(copia);
        System.out.println(list);
        Collections.reverse(list);

        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1,2,3,4));
        lista.addFirst(1);
        lista.addLast(9);

        ArrayList<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();






    }
}
