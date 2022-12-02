// The given array and the power is arr and pow. Sort the given array and
// power the elements with the pow.
//  Examples :
//  Input : arr = [ 1, 2, 3, 4, 5 ]
//  pow = 3
//  Output : [ 1, 8, 27, 64, 125 ]

//  Input : arr = [ -2, 1, 3, 4, 5 ]
//  pow = 2
//  Output : [ 1, 4, 9, 16, 25 ]

//  Input : arr = [ -19, -11, -3, 1, 2, 4, 6, 18 ]
//  pow = 2
//  Output : 1 4 9 16 36 121 324 361 

import java.util.Scanner;

public class PowerOfTheElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Limit : ");
        int number = input.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter Power: ");
        int pow = input.nextInt(),temp;
        System.out.println("Enter Elements");
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();
            int tempPow = pow;
            int power = 1;

            while (tempPow-- != 0) power *= arr[i];
            arr[i] = power;
        }
        for (int i = 0; i < number; i++)
            for (int j = i + 1; j < number; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
        for (int a : arr)
            System.out.print(a + " ");
    }
}




