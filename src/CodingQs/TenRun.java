package CodingQs;

import java.util.Arrays;

public class TenRun {
    /*public static void main(String[] args) {

        int[] x = {2,10,3,3,3,20,4,100,1,1,1}; //end

        System.out.println(Arrays.toString(tenRun(x)));

    }

    public static int[] tenRun(int[] arr) {

        for(int i=0;i<arr.length;i++) {

            if(arr[i]%10==0) {

                for(int j=i+1;j<arr.length && arr[j]%10 !=0;j++) {

                    arr[j]= arr[i];

                }

            }
        }

        return arr;




    }*/

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

    String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            result += str.charAt(i);

        }

    }

        System.out.println(result);

}

}

