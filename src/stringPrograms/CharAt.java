package stringPrograms;

public class CharAt {
    public static void main(String[] args){
        String str = "DineshKumar";
        char ch = str.charAt(5);
        System.out.println(ch);
        //First and Last character at array
        char first = str.charAt(0);//first
        char last = str.charAt(str.length()-1);//last
        System.out.println(first);
        System.out.println(last);

    }
}
