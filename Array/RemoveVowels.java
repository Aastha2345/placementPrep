package Array;
// REMOVE VOWELS FROM THE STRING
import java.util.*;


public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        // Using new string
        String modifiedString = "";
        // Using regex
        String newString = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("New string is: "+ newString);
        
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(!isVowel(current)){
                modifiedString += current;
            }
        }
        System.out.println("Modified string is:" + modifiedString);
    }
 
    static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
