package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Es_1 {
   /* public static void main(String[] args) {
        //in basso dentro al for abbiamo fatto in modo che dato un valore siamo risaliti alla chiave corrispondente 
        Map<String, Integer> q = new HashMap<String, Integer>();
        Map<String, Integer> q1 = new HashMap<String, Integer>();
        q.put("Sab", 1);
        q.put("Ric", 2);
        q.put("Sam", 3);
        System.out.println(q);
        System.out.println(q.size());
        q1.putAll(q);
        System.out.println(q1);
        q1.put("Ross", 7);
        System.out.println("******");
        if (q.containsValue(2)) {
            System.out.println("yes e la sua corrispettiva chiave e'");
            for(Map.Entry<String, Integer> i : q.entrySet()){
                if(i.getValue()==2){
                    System.out.println(i.getKey());
                }
            }
        }
    }*/
    public static void main(String[] args){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(Map.of(1,3,2,4));
        Es_1.esercizio(map);
    }
    public static void esercizio (Map<Integer,Integer> map){
        System.out.println(map.size());
        map.containsKey(3);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println( map.values());

    }
}
