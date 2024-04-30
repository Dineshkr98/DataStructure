package stringPrograms;

public class VowelsinString {
    public static void main(String[] args){
        String str = "Welcome Home Dinesh";

        String message = str.toLowerCase();
        int count =0;

        for(int i =0;i<str.length();i++){
            char c = message.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
                System.out.print(c);
            }

        }
        System.out.println();
        System.out.println("Total Numbers "+count);
        /////////////////////////////////////////////////////////////
        str = str.concat("Program Completed");//String Concat
        System.out.println(str);
        ///////////////////////////////////////////////////////////////
        System.out.println(str.contains("Dinesh"));//Contains
        if(str.contains("Marron")){
            System.out.println("ContainsPresent");
        }else
            System.out.println("Contains not Present");
        System.out.println(str.endsWith("d"));//endsWith
        System.out.println(str.startsWith("W"));//startswith
        //////////////////////////////////////////////////////////////
        String str1 = "Dinesh";
        String str2 = "Kumar";
        String str3 = "Dinesh";
        String str4 = "dinesh";

        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str2));
        String replacestr = str.replace('e','a');
        String replaceallstr = str.replaceAll("e","a");

        System.out.println(replacestr);
        System.out.println(replaceallstr);



    }
}
