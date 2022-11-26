package Week15;

import java.util.*;

public class NonRepeatingVowel {


    static int getFirstNonRepeatingVowel3(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (!map.containsKey(ch)) {
                    map.put(ch, i);
                } else {
                    map.put(ch, -1);
                }
            }
        }
        for (Integer value : map.values()) {
            if (value >= 0) {
                return value;
            }
        }
        return -1;
    }

    public static int getFirstNonRepeatingVowel(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i); // get all letters one by one
            if ("aeiou".contains("" + currentChar)) { // check if current char is vowel
                int count = 0;  // keep total occurrence count of the current vowel
                for (int j = 0; j < input.length(); j++) { // iterate over the same input to find current vowel count
                    if (currentChar == input.charAt(j)) {
                        count++; // if current char is found increase count
                    }
                }
                if (count == 1){ // check if the count equals to 1. If so, current vowel is non-repeated
                    return i; // since we focus on the FIRST non-repeating vowel, no need to check rest
                }
            }
        }
        return -1; // if all vowels are repeated or if there is no vowel, just return -1
    }

    public static int getFirstNonRepeatingVowel1(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i); // get chars one by one
            if ("aeiou".contains("" + currentChar)) { // check if current char is vowel
                // “put” operation below will add the current vowel for it’s first occurrence
                // for the next occurrences; “put” operation will update the VALUE of the vowel
                map.put(currentChar, map.getOrDefault(currentChar, 0)+1 );
            }
        }
        for (Map.Entry<Character, Integer> each : map.entrySet()) {
// iterate over map entries to find whose value is 1 (total occurrence)
            if (each.getValue() == 1){
                return input.indexOf(each.getKey()); // key of the map is holding the vowel, just return it
            }
        }
        return -1; // if above operation not returns an index, then we can assume all vowels are repeated or there is no vowel, just return -1
    }

    public static void main(String[] args) {
        String str = "responsible";
        System.out.println(firstNonRepeatingVowel(str));
    }

    public static int firstNonRepeatingVowel(String str){
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'i', 'e', 'o', 'u'));
        List<String> charList = new ArrayList<>(Arrays.asList(str.split("")));
        Map<Character, Integer> map = new LinkedHashMap<>();
        int result = -1;

        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), Collections.frequency(charList, charList.get(i)));
        }

        for(Character each: map.keySet()){
            for(Character eachVowel: vowels){
                if(each.equals(eachVowel) && map.get(each) < 2){
                    return str.indexOf(each);
                }
            }
        }

        return result;
    }
}
