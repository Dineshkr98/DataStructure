package stringPrograms;

public class StringPlaindrome {
    public static void main(String[] args){
        String original ="Madam";
        original = original.toLowerCase();

        int index=0;
        boolean compare = false;
        for(int i=original.length()-1;i>=0;i--){
            compare =(original.charAt(index) == original.charAt(i));
            index++;
        }
            if(compare)
                System.out.println("Given String is a palindrome");
                else
                System.out.println("Given String is not a palindrome");


        }
    }

