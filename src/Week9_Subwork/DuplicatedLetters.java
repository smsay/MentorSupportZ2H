package Week9_Subwork;

public class DuplicatedLetters {

    public static int getNumber(String str) {
        str = str.toLowerCase();
        String temp = "";
        String output = "";
        for (char ch : str.toCharArray()) {
            if (!temp.contains(ch + "")) {
                temp += ch;
            } else if (!output.contains(ch + "")) {
                output += ch;
            }
        }
        return output.length();
    }

    public static void main(String[] args) {
        System.out.println(getNumber("aabbcd"));
    }
}
