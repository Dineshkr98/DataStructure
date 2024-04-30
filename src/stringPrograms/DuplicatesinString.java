package stringPrograms;

public class DuplicatesinString {
    public static void main(String[] args){
        String str = "abbccddeea";
        char[] ch = str.toCharArray();
        int count =0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
                if(ch[i]==ch[i+1]){
                    result.append(ch[i]);
                    count++;
                }

        }
        System.out.println("Duplicates in the String: "+result+"\n"+"Number of Duplicates"+count);
    }
}
