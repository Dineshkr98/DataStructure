package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Declaration {
    public static void main(String[] args){
        String str = "MADAS";
        String[] pal = str.split("");


        System.out.println("Original String");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(pal));
        System.out.println(al);

        System.out.println("Reverse Order");
        ArrayList<String> rev = new ArrayList<>(Arrays.asList(pal));
        Collections.reverse(rev);
        System.out.println(rev);

        if(al.equals(rev)){
            System.out.println("Given String is palindrome");
        }else
            System.out.println("Given String is not a palindrome");




        //System.out.println(al);
        /*al.add(16);
        System.out.println(al);
        al.add(2,14);
        System.out.println(al);
        al.set(2,45);
        System.out.println(al);
        al.remove(Integer.valueOf(4));
        System.out.println(al);



        Collections.ArrayList<Integer> al_dup = new Collections.ArrayList<>();
        al_dup.addAll(al);
        System.out.println(al_dup);*/


    }
}
