import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello World");

        // Variable Declaration
        long myLong = 10;
        int myInt = 10;
        float myFloat = 10.5f;
        double myDouble = 10.5;
        char myChar = 'a';
        boolean myBoolean = true;
        String myName = "Yehezkiel";
        int[] myIntArray = {10, 20, 30};

        // Print
        System.out.println("My Long = " + myLong);
        System.out.println("My Int = " + myInt);
        System.out.println("My Float = " + myFloat);
        System.out.println("My Double = " + myDouble);
        System.out.println("My Char = " + myChar);
        System.out.println("My Boolean = " + myBoolean);
        System.out.println("My Name = " + myName);
        System.out.print("My Int Array = ");
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[i]+", ");
        }
        System.out.println("My Int Array = "+ Arrays.toString(myIntArray));


    }
}