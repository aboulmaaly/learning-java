/**
 * Copying From Array
 *
 * The System class has an arraycopy method that you can use
 * to efficiently copy data from array into another.
 *
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 *
 **/
public class JavaCopyFromTo{

	public static void main(String[] args) {

		// Array Source
		char[] arrayFrom = {'M', 'L', 'J', 'A', 'V', 'A', 'T', 'E'};

		// Array Destination
		char[] arrayTo = new char[4];

		// Proceed copy from arrayFrom to arrayTo
		System.arraycopy(arrayFrom, 2, arrayTo, 0, 4);

		// Convert arrayTo to a string 
		String arrayToStr = new String(arrayTo);
		
		// Print arrayToStr
		System.out.println(arrayToStr);
		// Output : JAVA

	}
}