/**
 * Multidimensional Arrays
 *
 * In the Java programming language, a multidimensional array is an array
 * whose components are themselves arrays.
 *
 **/
public class JavaMultidimArrays {

    public static void main(String[] args) {

        String[][] names = {
                {"Mr ", "Mrs ", "Ms "},
                {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]);
        // Output : Mr Smith

        System.out.println(names[0][2] + names[1][1]);
        // Output : Ms Jones
    }
}
