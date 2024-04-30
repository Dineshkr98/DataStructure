package stringPrograms;

public class StringReverse {
    public static void main(String[] args){
        String str = "Welcome to Interview Dinesh";
        String[] arr = str.split(" ");
        System.out.println(arr.length);
        String rev = "";
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            rev = arr[i].toString();
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                res += rev.charAt(j);
            }
            System.out.print(res + " "); // Add a space after each reversed word
           res = ""; // Reset res for the next word
        }

        String first = arr[0].toString();
        String second = arr[1].toString();
        String third = arr[2].toString();
        String rev1 ="";
        String rev2 ="";
        String rev3 ="";
        for(int i=arr[0].length()-1;i>=0;i--){
            rev1+= first.charAt(i);
        }
        for(int i=arr[1].length()-1;i>=0;i--) {
            rev2 += second.charAt(i);
        }
        for(int i=arr[2].length()-1;i>=0;i--) {
            rev3 += third.charAt(i);
        }
        System.out.println(rev1+" "+rev2+" "+rev3);
        }
    }

