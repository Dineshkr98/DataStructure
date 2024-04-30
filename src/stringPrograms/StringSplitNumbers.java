package stringPrograms;

public class StringSplitNumbers {
    public static void main(String[] args){
        String mixed = "sfs7er8sdsfd45ser";
        char ch;
        int index=0;
        StringBuilder alpha= new StringBuilder();
        String numbers="";
        int num=0;
        for(int i=0;i<mixed.length();i++){
            if(Character.isLetter(mixed.charAt(i))){
                alpha.append(mixed.charAt(i));
            }else if (Character.isDigit(mixed.charAt(i))) {
                  ch =mixed.charAt(i);
                  numbers = String.valueOf(ch);
                  num+=Integer.parseInt(numbers);
            }
        }
        //num = Integer.parseInt(numbers);
        System.out.println("Alphabets: "+alpha+"\n"+"Numbers: "+num);
    }
}
