package CodingQs;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();

        System.out.println("Factorial of "+x+" is: "+factorial(x));

    }
    public static int factorial(int number){

       int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;

}

    public static int factorialRecursive(int n){
        if (n == 0) {
            return 1;
        }else{
            return(n * factorial(n-1));
    }
    }
}
