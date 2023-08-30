public class Leetcode_509_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int result = fibonacci(n-1) + fibonacci(n-2);
        return result;
    }
}
