package Week15;

import java.util.*;

public class FrequencyOfCharacters {

    public static Map<Character, Integer> defaultSolution(String  str) {
        Map<Character, Integer> map = null; // this map is return map
        if (str == null)
            return map; // if the input is null just return null map object

        map = new HashMap<>();	// after input’s null check we can initialize our returning map

        for (Character each : str.toCharArray()) {    // iterate over each character of the input
            if (map.containsKey(each)) {      // first check if the current character exist in the map as a key
                map.put(each, map.get(each) + 1);  //if it exists, then update it’s value by increasing the current value
            } else {      // if the key not exist as a key, then simply put character as key and 1 as value
                map.put(each, 1);   //this line only runs first occurrence of each character
            }
        }

        return map;
    }

    static Map<Character, Integer> altSolution(String str){
        if (str == null) return null;
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    public static void main(String[] args) {
        String str = "responsible";
        System.out.println(frequency(str));
    }

    public static Map<String, Integer> frequency(String str){
        Map<String, Integer> characterMap = new LinkedHashMap<>();
        List<String> charList = new ArrayList<>(Arrays.asList(str.split("")));

        if(str.isEmpty()){
            return characterMap;
        } else if(str.equals(null)){
            return null;
        } else {
            for(int i = 0; i < charList.size(); i++){
                characterMap.put(str.substring(i, i + 1), Collections.frequency(charList, charList.get(i)));
            }
        }
        return characterMap;
    }

}
