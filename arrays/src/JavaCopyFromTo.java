/**
 * Copying From Array
 * *******************
 *
 * The System class has an arraycopy method that you can use
 * to efficiently copy data from array into another.
 *
 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 *
 * Array Manipulations
 * ********************
 *
 * Java SE provides several methods for performing array manipulations, 
 * such as copying, sorting and searching array, in the java.util.Arrays class. 
 * For instance, we can use the copyOfRange method of the java.util.Arrays class, 
 * as you can see in the JavaCopyFromTo example.
 *
 * copyOfRange(char[] original, int from, int to)
 *
 **/
public class JavaCopyFromTo{

	public static void main(String[] args) {

		/*----------------------- Using arraycopy method ----------------------- */
		// Source Array
		char[] arrayFrom = {'M', 'L', 'J', 'A', 'V', 'A', 'T', 'E',};

		// Destination Array
		char[] arrayTo = new char[4];

		// Proceed copy from arrayFrom to arrayTo
		System.arraycopy(arrayFrom, 2, arrayTo, 0, 4);

		// Convert arrayTo to a string 
		String arrayToStr = new String(arrayTo);
		
		// Print arrayToStr
		System.out.println(arrayToStr);
		// Output : JAVA

		/*----------------------- Using copyOfRange method ----------------------- */
		// Source Array
		char[] arrayFrom_2 = {'M', 'J', 'A', 'V', 'A', 'S', 'E', 'D', 'k'};

		// Destination Array
		char[] arrayTo_2 = java.util.Arrays.copyOfRange(arrayFrom_2, 1, 7);

		// Convert arrayTo_2 to a string 
		String arrayToStr_2 = new String(arrayTo_2);
		
		// Print arrayToStr_2
		System.out.println(arrayToStr_2);
		// Output : JAVASE

	}
}