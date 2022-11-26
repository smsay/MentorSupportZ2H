package Week15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SumOfTwoSeries {

    public static void main(String[] args) {
        Map<Integer, Double> map1 = new LinkedHashMap<>(Map.of(1, 1.0, 2, 1.5, 3, 2.0));
        Map<Integer, Double> map2 = new LinkedHashMap<>(Map.of(2, 1.0, 3, 2.5, 5, 1.0));

        System.out.println(summation(map1, map2));
    }

    public static Map<Integer, Double> summation(Map<Integer, Double> map1, Map<Integer,Double> map2){
        Map<Integer, Double> resultMap = new TreeMap<>();

        for(Integer each: map1.keySet()){
            for(Integer eachKey: map2.keySet()){
                if(!map2.containsKey(each)){
                    resultMap.put(each, map1.get(each));
                } else if(each.equals(eachKey)){
                    resultMap.put(eachKey, map1.get(each) + map2.get(eachKey));
                } else {
                    resultMap.put(eachKey, map2.get(eachKey));
                }
            }
        }

        return resultMap;
    }

    private static Map<Integer, Double> defaultSolution(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>();   for (Map.Entry<Integer, Double> entry : map1.entrySet()) {
            // add elements of map1 to result
            if (!result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            } else result.put(entry.getKey(), result.get(entry.getKey()) + entry.getValue());
        }
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {   // add elements of map2 to result
            if (!result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue());
            } else result.put(entry.getKey(), result.get(entry.getKey()) + entry.getValue());
        }
        return result;
    }

    public static Map<Integer, Double> altSolution(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        // create the returning map by adding all pairs of the map1, then focus on map2
        Map<Integer, Double> result = new HashMap<>(map1);
// iterate over each key-value pair of the map2
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            result.put(entry.getKey(), result.getOrDefault(entry.getKey(), 0D) + entry.getValue());
        }
        return result;
    }

    public static Map<Integer, Double> altSolution3(Map<Integer, Double> map1, Map<Integer, Double> map2) {
        Map<Integer, Double> result = new HashMap<>(map1);
        map2.forEach((k, v) -> result.put(k, result.getOrDefault(k, 0D) + v));
        return result;
    }

}