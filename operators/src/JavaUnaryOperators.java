/**
 * Unary Operators
 *
 * The unary operators require only one operand; they perform various operations such as
 * incrementing/decrementing a value by one negating an expression,
 * or inverting the value of a boolean.
 *
 * Operators : +, -, ++, --, !
 * */
public class JavaUnaryOperators {
    public static void main(String[] args) {
        int result = 1;
        boolean success = false;

        result = +result;
        System.out.println(result);
        // Output : 1

        result++;
        System.out.println(result);
        // Output : 2

        result--;
        System.out.println(result);
        // Output : 1

        result = -result;
        System.out.println(result);
        // Output : -1

        System.out.println(success);
        // Output : false

        System.out.println(!success);
        // Output : true

        /*
         * The increment/decrement operators can be applied before (prefix) or after (postfix) the operand.
         * The code result++; and ++result; will both end in result being incremented by one.
         * The only difference is that the prefix version (++result) evaluates to the incremented value,
         * whereas the postfix version (result++) evaluates to the original value.
         *
         * The following example, illustrates the prefix/postfix unary increment operator:
         **/

        int i = 0;
        i++;
        System.out.println(i);   // Output : 1
        ++i;
        System.out.println(i);   // Output : 2
        System.out.println(++i); // Output : 3
        System.out.println(i++); // Output : 3
        System.out.println(i);   // Output : 4
    }
}
