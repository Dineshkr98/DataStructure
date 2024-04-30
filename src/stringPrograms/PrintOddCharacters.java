package stringPrograms;

public class PrintOddCharacters {
    public static void main(String[] args){
        String name = "Hello Dinesh Kumar";
        for(int i=0;i<=name.length()-1;i++){
            if(i%2!=0){
                System.out.println(name.charAt(i));
            }
        }
    }
}
