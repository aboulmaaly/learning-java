/**
 * The break Statement
 *
 * The break statement has two forms: "labeled" and "unlabeled".
 * You saw the unlabeled form in the previous discussion of the switch statement.
 * You can also use an unlabeled break to terminate a for, while, or do-while loop.
 **/
public class JavaBreak {
    public static void main(String[] args) {

        int[] numbers = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int searchFor = 8;

        int index;
        boolean foundIt = false;

        for (index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + index);
        } else {
            System.out.println(searchFor + " not in the array");
        }
        /*
         * This program searches for the number 8 in an array.
         * The break statement ( in line number 20 ) terminates the for loop when that value is found.
         *
         * Output:
         *      Found 8 at index 7
         * */
    }
}
