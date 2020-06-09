/**
 * The Equality and Relational Operators
 *
 * The equality and relational operators determine if one operand is greater than,
 * less than, equal to, or not equal to another operand.
 * The majority of these operators will probably look familiar to you as well.
 * Keep in mind that you must use "==", not "=", when testing if two primitive values are equal.
 *
 * Operators : ==, !=, >, >=, <, <=
 **/
public class JavaEqualityOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;

        System.out.println(x == y);
        // Output : false
        // That means : x is not equal to y

        System.out.println(x != y);
        // Output : true
        // That means : x is not equal to y

        System.out.println(x > y);
        // Output : false
        // That means : x is not greater than y

        System.out.println(x >= y);
        // Output : false
        // That means : x is not greater than or equal to y

        System.out.println(x < y);
        // Output : true
        // That means : x is less than y

        System.out.println(x <= y);
        // Output : true
        // That means : x is less than or equal to y
    }
}
