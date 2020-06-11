/**
 * While, Do While Statements
 *
 * The while statement continually executes a block of statements while a particular condition is true.
 * The while statement evaluates expression, which must return a boolean value.
 * If the expression evaluates to true, the while statement executes the statement(s) in the while block.
 * The while statement continues testing the expression and executing its block until the expression evaluates to false.
 *
 * The Java programming language also provides a do-while statement.
 * The difference between do-while and while is that do-while evaluates its expression
 * at the bottom of the loop instead of the top.
 * Therefore, the statements within the do block are always executed at least once.
 **/
public class JavaWhileDo {
    public static void main(String[] args) {

        // While example
        int x = 1;
        while (x < 4) {
            System.out.println("Count is: " + x);
            x++;
        }
        /*
         * Output:
         *      Count is: 1
         *      Count is: 2
         *      Count is: 3
         **/

        /*
         * Infinite loop
         * while (true){
         *    your code goes here
         * }
         *
         **/

        // Do While example
        int y = 1;
        do {
            System.out.println("Count is: " + y);
            y++;
        } while (y < 4);
        /*
         * Output:
         *      Count is: 1
         *      Count is: 2
         *      Count is: 3
         **/



    }
}
