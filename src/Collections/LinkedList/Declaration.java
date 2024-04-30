package Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Declaration {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add("Dog");
        list.add(2);
        list.add(2.5);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.addFirst(0);;
        list1.addLast(3);
        System.out.println(list1);


        Iterator it = list1.iterator();
        while(it.hasNext()){
            System.out.println( it.next());
        }

    }
}
