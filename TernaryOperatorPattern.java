4. Print the given number in to this Pattern.
Note : Use only Ternary Operator for logic.
 Example :
 Input : Enter the value : 3
 Output : 3 3 3 3 3
 3 2 2 2 3
 3 2 1 2 3
 3 2 2 2 3
 3 3 3 3 3 



import java.util.Scanner;

public class TernaryOperatorPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int num = input.nextInt(), length = num * 2 - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                System.out.print(j == length - 1 || i == 0 || i == length - 1 || j == 0 ? "3 " : (j == length - 2 || i == 1 || i == length - 2 || j == 1) ? "2 " : (j == length - 3 || i == 2 || i == length - 3 || j == 2) ? "1 " : "");
            System.out.println();
        }

    }

}

