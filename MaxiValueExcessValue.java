// An array of size N is processed in such a way that each number in the
// array can only hold value in the order of 2 ^ n. If a particular position
// holds an excess value it is passed on to the next position in the array.
// This way print the maximum value each position can hold and the excess
// value at the last position.
//  Examples :
//  Input : N = 5
//  arr = [ 12, 25, 10, 7, 8 ]
//  Output : Maximum value at each position is : [ 8, 16, 16, 8, 8 ]
//  Excess value at last position : 6
//  Input : N = 5
//  arr = [ 39, 121, 12, 23, 8 ]
//  Output : Maximum value at each position is : [ 32, 128, 8, 16, 16 ]
//  Excess value at last position : 6 
   
import java.util.Scanner;

public class MaxiValueExcessValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int number = input.nextInt();
        int[] arr = new int[number];
        int reminder;
        System.out.println("Enter Elements");
        for (int i = 0; i < number; i++)
            arr[i] = input.nextInt();

        int i = 0;
        while (i < number - 1) {

            reminder = findReminder(arr[i]);
            arr[i] = arr[i]-reminder;
            arr[i + 1] = arr[i + 1] + reminder;

            i++;
        }

        System.out.println(findReminder(arr[number - 1]));

    }

    static int findReminder(int power) {
        int temp = 0,number=1;
        while (number <= power) {
            temp = number;
            number = number * 2;

        }
        return power - temp;

    }

}


