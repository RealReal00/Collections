package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Person> l = new ArrayList<Person>();
        l.add(new Person("Marco","Rossi",18));
        l.add(new Person("Luca","Bianchi",16));
        l.add(new Person("Marco","Bianchi",26));

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

    }
}
