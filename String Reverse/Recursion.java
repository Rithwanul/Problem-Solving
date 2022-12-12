
public class Recursion {

    public static void reverseString(String str)
    {
        if (str.isEmpty() || str.length() < 1) {
            System.out.print(str);
        } else {
            char result = str.charAt(str.length() - 1);
            System.out.print(Character.toLowerCase(result));
            reverseString(str.substring(0, str.length() -1));
        }


    }


    public static void main(String[] args) {
        String name = "Rithwanul Islam";
        reverseString(name);
    }
}