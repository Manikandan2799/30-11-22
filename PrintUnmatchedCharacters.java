Given two string of same length, print the characters which does not
match in the two.
 Example :
 Input : String 1 = “abcdefeghijklm”
 String 2 = “abcduabihijkim”
 Output : Result = “eufaebgili” 
 
import java.util.Scanner;

public class PrintUnmatchedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String string1 = sc.next();
        System.out.println("Enter Second String: ");
        String string2 = sc.next();
        String output = "";
        for (int i = 0; i < findLengthOfString(string1); i++)
            for (int j = 0; j < findLengthOfString(string2); j++) {
                if (string1.charAt(i) != string2.charAt(j)) {
                    output = output + string1.charAt(i);
                    output = output + string2.charAt(j);
                }
                i++;
            }
        System.out.println(output);
    }

    static int findLengthOfString(String s) {
        char[] a = s.toCharArray();
        int length = 0;
        for (char c : a) ++length;
        return length;
    }

}

