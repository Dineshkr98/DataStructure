package stringPrograms;

public class SplitString {
    public static void main(String[] args){
        String str = "GodofWar";
        String[] arr = str.split("\\s",3);
        for(String string:arr)
        System.out.println(string);
        System.out.println(str.substring(3));
        char[] ch = str.toCharArray();
        
    }
}
