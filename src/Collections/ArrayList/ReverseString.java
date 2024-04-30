package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to Interview";
        String[] arr = str.split("");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(al);
        System.out.println(String.join("",al));
    }
}


