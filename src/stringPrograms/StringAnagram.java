package stringPrograms;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {

        String str1="silent";
        String str2="listen";
        if(str1.length()==str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2))
                System.out.println("Given String is a Anagram");
            else
                System.out.println("Given String is not a Anagram");
        }else
            System.out.println("Given String is not a Anagram");

    }
}