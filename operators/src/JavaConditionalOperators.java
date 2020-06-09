/**
 * The Conditional Operators
 *
 * The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions.
 * These operators exhibit "short-circuiting" behavior,
 * which means that the second operand is evaluated only if needed.
 *
 * Operators : &&, ||
 * */
public class JavaConditionalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;

        System.out.println((x == 1) && (y == 3)); // Output : true
        System.out.println((x == 1) && (y == x)); // Output : false
        System.out.println((x == 1) || (y == x)); // Output : true
        System.out.println((x == 1) || (y == 3)); // Output : true
    }
}
