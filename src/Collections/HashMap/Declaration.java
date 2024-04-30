package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Declaration {
    public static <set, object> void main(String[] args){
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(101,"Dinesh");
        hs.put(102,"Ruthra");
        hs.put(103,"Vignesh");
        System.out.println(hs);
        hs.put(103,"David");
        hs.put(104,"Has");
        System.out.println(hs);
        hs.remove(104);
        System.out.println(hs.containsKey(104));
        System.out.println(hs.keySet());//return all keys
        System.out.println(hs.values());//return al values
        System.out.println(hs.entrySet());
        for(int i:hs.keySet()){
            System.out.println(i);
        }
        for(String i:hs.values()){
            System.out.println(i);
        }
        for(Map.Entry<Integer, String> i:hs.entrySet()){
            System.out.println(i.getKey()+"-"+i.getValue());
        }
    }
}
