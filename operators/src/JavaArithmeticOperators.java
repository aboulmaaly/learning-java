/**
 * Arithmetic Operators
 *
 * The java programming language provide operators that perform
 * addition, subtraction, multiplication, and division.
 * The only symbol that might look new to you is "%",
 * which divides one operand by another and returns the remainder as its result.
 *
 * Operators : +, -, /, *, %
 */
public class JavaArithmeticOperators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        // Output : 1 + 2 = 3

        int result_2 = 5 - 2;
        System.out.println("5 - 2 = " + result_2);
        // Output : 5 - 2 = 3

        int result_3 = 5 * 2;
        System.out.println("5 * 2 = " + result_3);
        // Output : 5 * 2 = 10

        int result_4 = result_3 / 2;
        System.out.println("result_3 / 2 = " + result_4);
        // Output : result_3(10) / * 2 = 5

        int result_5 = result_3 % 4;
        System.out.println("result_3 % 4 = " + result_5);
        // Output : result_3(10) % 4 = 2
        // 10 % 4 = 10 - ( 4 * ( 10 / 4 ) )
        // 10 % 4 = 10 - ( 4 * 2 )
        // 10 % 4 = 10 - ( 8 )
        // 10 % 4 = 2

        /*
         * The + operator can also be used for concatenating (joining)
         * two strings together, as shown in the following example.
         **/

        String hello = "Hello ";
        String world = "World!";
        String helloWorld = hello + world;
        System.out.println(helloWorld);
        // Output : Hello World!

    }
}
