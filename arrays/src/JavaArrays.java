/**
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created.
 * After creation, its length is fixed.
 * Each item in an array is called an element, and each element is accessed by its numerical index.
 *
 * @author Aboulmaaly Mohamed
 *
 **/
public class JavaArrays {

    public static void main(String[] args) {
        // declares an array of integers
        int[] myArray;

        //Similarly, you can declare arrays of other types:

        // byte[]    myArrayOfBytes;
        // short[]   myArrayOfShorts;
        // long[]    myArrayOfLongs;
        // float[]   myArrayOfFloats;
        // double[]  myArrayOfDoubles;
        // boolean[] myArrayOfBooleans;
        // char[]    myArrayOfChars;
        // String[]  myArrayOfStrings;


        // allocates memory for 3 integers
        myArray = new int[3];

        // Alternatively, you can use the shortcut syntax to create and initialize an array:

        // int[] myArray = {10, 65, 78, 1, 45};


        // initialize elements
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        System.out.println("Element at index 0: " + myArray[0]);
        System.out.println("Element at index 1: " + myArray[1]);
        System.out.println("Element at index 2: " + myArray[2]);

        // The output is:
        // Element at index 0: 1
        // Element at index 1: 2
        // Element at index 2: 3

    }
}