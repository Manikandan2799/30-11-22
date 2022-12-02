// Given a String we have to reverse the string without changing the
// position of special characters, punctuations and spaces.
//  Example :
//  Input : House No : 123@ CBE
//  Output : EBC32 1o : Nes@ uoH 
 
import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int length = lengthString(string);
        String revString = "";
        {
            int i = length - 1;
            while (i >= 0) {
                if (string.charAt(i) != '@' && string.charAt(i) != ':' && string.charAt(i) != ' ')
                    revString += string.charAt(i);
                i--;
            }
        }
        int i = 0, j = 0;
        while (i < length) {
            if (string.charAt(i) != '@' && string.charAt(i) != ':' && string.charAt(i) != ' ') {
                System.out.print(revString.charAt(j));
                j++;
            } else
                System.out.print(string.charAt(i));
            i++;
        }
    }

    static int lengthString(String s) {
        char[] a = s.toCharArray();
        int length = 0;
        for (char c : a) ++length;
        return length;
    }
}

