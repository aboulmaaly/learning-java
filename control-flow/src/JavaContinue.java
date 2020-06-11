/**
 * The continue Statement
 *
 * The continue statement skips the current iteration of a for, while , or do-while loop.
 * The unlabeled form skips to the end of the innermost loop's body and evaluates
 * the boolean expression that controls the loop.
 **/
public class JavaContinue {
    public static void main(String[] args) {

        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        // Calculate number of i's in str
        int ni = 0;

        /*
         * The following example, steps through a String "str",
         * counting the occurences of the letter "i".
         *
         * If the current character is not a letter "i",
         * the continue statement skips the rest of the loop and proceeds to the next character.
         *
         * If it is a letter "i", the program increments the letter "ni".
         **/
        for (int x = 0; x < str.length(); x++){

            // Interested only in i's
            if(str.charAt(x) != 'i'){
                continue;
            }

            // Increment ni
            ni++;
        }

        System.out.println("Found " + ni + " i's in the string str.");
        // Output : Found 6 i's in the string str.
    }
}
