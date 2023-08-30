package BitManipulation;

public class bitwiseOperator{
    public static void main(String[] args) {
        int a = 17, b=5;
        System.out.println("a & b = "+ (a&b));
        System.out.println("a | b = " + (a | b));
        System.out.println("~ a = "+ (~a));
        System.out.println("a ^ b = "+ (a ^ b));

        // left shift and right shift oprators
        int c = 10;
        System.out.println("c << 2 = " + (c<<2)); // left shift for signed integer. For unsigned operator is >>>
        System.out.println("c >> 2 = " + (c>>2)); // right shift
    }
}