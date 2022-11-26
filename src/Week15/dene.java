package Week15;

import java.util.ArrayList;
import java.util.*;

public class dene {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,2,3,2,1};
        System.out.println("arr = " + Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList(List.of(arr));
        System.out.println("list = " + list);

        LinkedList<Integer> linkedList = new LinkedList(list);
        System.out.println("linkedList = " + linkedList);

        Vector<Integer> vector = new Vector(linkedList);
        System.out.println("vector = " + vector);

        Stack<Integer> stack = new Stack();
        //stack.addAll(vector);
        System.out.println("stack = " + stack);

    }
}
