import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ElementsOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<5;i++){
            if(i%2==0){
                even.add(sc.nextInt());
            }
            else{
                odd.add(sc.nextInt());
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even +" " + odd);
        int evenLength = even.size();
        int oddLength = odd.size();
        System.out.println(evenLength+" "+oddLength);
        int secondEvenLargest = even.get(even.size()-2);
        int secondOddLargest = odd.get(odd.size()-2);
        int sum = secondEvenLargest + secondOddLargest;
        System.out.println(sum);
    }
}
