/**
 * Bitwise and Bit Shift Operators
 *
 * The Java programming language also provides operators that perform bitwise and bit shift operations on integral types.
 * The operators discussed in this section are less commonly used.
 * Therefore, their coverage is brief; the intent is to simply make you aware that these operators exist.
 *
 * The unary bitwise complement operator "~" inverts a bit pattern;
 * it can be applied to any of the integral types, making every "0" a "1" and every "1" a "0".
 *
 * For example, a byte contains 8 bits;
 * applying this operator to a value whose bit pattern is "00000000" would change its pattern to "11111111".
 *
 * The signed left shift operator "<<" shifts a bit pattern to the left,
 * and the signed right shift operator ">>" shifts a bit pattern to the right.
 * The bit pattern is given by the left-hand operand, and the number of positions to shift by the right-hand operand.
 *
 * The unsigned right shift operator ">>>" shifts a zero into the leftmost position,
 * while the leftmost position after ">>" depends on sign extension.
 *
 * The bitwise & operator performs a bitwise AND operation.
 *
 * The bitwise ^ operator performs a bitwise exclusive OR operation.
 *
 * The bitwise | operator performs a bitwise inclusive OR operation.
 *
 * Operators : ~, <<, >>, >>>, &, ^, |
 **/
public class JavaBitwiseOperators {

    public static void main(String[] args) {

        int x = 5;  // binary : 0101
        int y = 10; // binary : 1010
        int z = -5;

        // left shift operator : <<
        System.out.println(x << 2);
        // Output : 20
        // 0000 0101 << 2 = 0001 0100 (20)
        // similar to ( 5 * ( 2 ^ 2 ) )

        // right shift operator : >>
        System.out.println(x >> 2);
        // Output : 1
        // 0000 0101 >> 2 = 0000 0001 (1)
        // similar to ( 5 / ( 2 ^ 2 ) )

        // unsigned rigt shift operator : >>>
        System.out.println(z >>> 2);

        // bitwise and : &
        System.out.println(x & y);
        // Output : 0
        // 0101 & 1010 = 0000 = 0

        // bitwise or : |
        System.out.println(x | y);
        // Output : 15
        // 0101 | 1010 = 1111 = 15

        // bitwise and : ~
        System.out.println(~x);
        // Output : -6
        // ~ 0101 = 1010
        // will give 2's complement of 1010 = -6

        // bitwise xor : ^
        System.out.println(x ^ y);
        // Output : 15
        // 0101 | 1010 = 1111 = 15
    }
}
