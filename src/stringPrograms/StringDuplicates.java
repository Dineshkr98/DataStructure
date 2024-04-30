package stringPrograms;

public class StringDuplicates {
    public static void main(String[] args){
        String str ="ABBCCDDEEA";
        int count=0;
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[i]);
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
