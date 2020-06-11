/**
 * For Statement
 *
 * The for statement provides a compact way to iterate over a range of values.
 * Programmers often refer to it as the "for loop" because of the way in which it
 * repeatedly loops until a particular condition is satisfied.
 *
 * for (initialization; termination; increment) {
 *     statement(s)
 * }
 *
 * When using the for statement, keep in mind that:
 *      - The initialization expression initializes the loop; it's executed once, as the loop begins.
 *      - When the termination expression evaluates to false, the loop terminates.
 *      - The increment expression is invoked after each iteration through the loop;
 *        it is perfectly acceptable for this expression to increment or decrement a value.
 *
 * The for statement also has another form designed for iteration through Collections and arrays;
 * This form is sometimes referred to as the "enhanced for statement",
 * and can be used to make your loops more compact and easy to read.
 **/
public class JavaFor {
    public static void main(String[] args) {

        // For loop example
        for(int i = 1; i < 4; i++){
            System.out.println("Count is: " + i);
        }
        /*
         * Output:
         *      Count is: 1
         *      Count is: 2
         *      Count is: 3
         **/

        /*
         * Infinite loop
         * for ( ; ; ) {
         *      // your code goes here
         * }
         **/

        // Enhanced For Loop
        int[] numbers = {10, 20, 30, 40};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
        /*
         * Output:
         *      Count is: 10
         *      Count is: 20
         *      Count is: 30
         *      Count is: 40
         **/

    }
}
