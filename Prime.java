import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        //int ans = isPrime(3);
        //System.out.println(isPrime(3));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        System.out.println(num);
        if(isPrime(num)){
            System.out.println("It is prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }

    public static boolean isPrime(int num){
        if(num==1)
            return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
