package Week18Generics_Enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UpperBoundWildcard {

    private static Double add(ArrayList<? extends Number> num) {

        double sum = 0.0;
        for (Number n : num) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        System.out.println("displaying the sum= " + add(l1));

        ArrayList<Double> l2 = new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("displaying the sum= " + add(l2));
    }

 /*   List<String> names = Arrays.asList(
            "Apple", "Banana", "Avocado", "Melon", "Grape" , "Apricot");
    Predicate<String> p = (s) -> s.startsWith("A");
        for (String st : names) {
        // call the test method
        if (p.test(st))
            System.out.println(st);
    }
}
*/
}