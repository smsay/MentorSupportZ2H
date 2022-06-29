package CodingQs;

public class IsEveryWhere {

    public static void main(String[] args) {

        int[] x = {1, 2, 1, 3, 4};
        int a = 1;

        System.out.println(isEverywhere(x, a));

    }

    public static boolean isEverywhere(int[] arr,int number) {

        for(int i=0;i<arr.length-2;i++) {

            if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
                return true;
            }
        }

        return false;
    }
}
