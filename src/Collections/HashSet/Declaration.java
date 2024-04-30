package Collections.HashSet;

import java.util.HashSet;

public class Declaration {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(100);
        HashSet hs2 = new HashSet();
       HashSet<Integer> hsI = new HashSet<>();
       hsI.add(1);
       hsI.add(2);
       hsI.add(3);
       hsI.add(4);
       hsI.add(5);
       System.out.println(hsI);

       HashSet<Integer> hsI2 = new HashSet<>();
       hsI2.add(3);
       hsI2.add(4);
       hsI2.add(5);
       System.out.println(hsI2);

      // hsI.addAll(hsI2);
       //System.out.println(hsI);

       // hsI.retainAll(hsI2);
       // System.out.println(hsI);

       // hsI.removeAll(hsI2);
        //System.out.println(hsI);

        //hsI.containsAll(hsI2);
        System.out.println( hsI.containsAll(hsI2));






    }
}
