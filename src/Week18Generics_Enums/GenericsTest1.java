package Week18Generics_Enums;

public class GenericsTest1 {

    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(8);

        // Calling generic method with String argument
        genericDisplay("CodeBusters");

        // Calling generic method with double argument
        genericDisplay(11.0);
    }

    public static < E > void printArray(E[] elements) {
        for ( E element : elements){
            System.out.println(element );
        }
        System.out.println();
    }
/*  //  public static void main( String args[] ) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A' };

        System.out.println( "Printing Integer Array" );
        printArray( intArray  );

        System.out.println( "Printing Character Array" );
        printArray( charArray );
    }*/
}
