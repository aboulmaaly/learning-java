/**
 * IF, ELSE IF, ELSE Statements
 *
 * The if statement is the most basic of all the control flow statements.
 * It tells your program to execute a certain section of code only if a particular test evaluates to true.
 *
 * The if-else statement provides a secondary path of execution when an "if" clause evaluates to false.
 * */
public class JavaIfElse {
    public static void main(String[] args) {

        int score = 76;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
        // Output : Grade = C
    }
}
