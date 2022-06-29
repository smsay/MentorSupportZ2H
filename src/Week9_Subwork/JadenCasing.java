package Week9_Subwork;

import java.util.Arrays;

public class JadenCasing {

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        String result = "";
        String[] strings = phrase.split(" ");
        for (String str : strings) {
            result += (str.charAt(0) + "").toUpperCase() + str.substring(1) + " ";
        }
        return result.trim();
    }


    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        char[] array = phrase.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ') {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("hi everyone how are you?"));
        System.out.println(toJadenCase2("hi everyone how are you?"));



        int[][] arr2D = { {10,20,30}, {4,5,6,7,8}, {60,70,80,90} };
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println((arr2D[1][1]));

    }
}
