package stringPrograms;

public class StringReversal {
    public static void main(String[] args) {
        String originalString = "Welcome to interview" +"";
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        System.out.println("Reversed String: " + reversedString);
    }
}
