package Comparable_Comparator;

public class Person implements Comparable<Person>{
    String name;
    String surname;
   Integer age;

    public Person(String name, String surname, int age){
        super();
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name +", surname=" + surname + ", age=" + age + "]";
    }
    //qui sotto vedi che il metodo compareTo che si trova dentro l'interfaccia
    // comparable ci abbiamo fatto un overraid con all'interno il metodo compareTo specifico delle stringhe
    //in questo modo possiamo confrontare la persona direttamente da dentro la classe
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
