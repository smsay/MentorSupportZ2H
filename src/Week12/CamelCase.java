package Week12;

public class CamelCase {

    public static String camelCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            output = Character.isUpperCase(ch) ? output + " " + ch : output + ch;
        }
        return output;
    }

}
