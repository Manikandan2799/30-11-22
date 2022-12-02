// Find which is the nearest number in this array of average.
//  Example :
//  Input : Array Elements is : [ 1, 2, 3, 4, 5 ]
//  Output : The element is : 3
//  Input : Array Elements is : [ 1, 8, 2, 10 ]
//  Output : The element is : 8 

import java.util.Arrays;
import java.util.Scanner;

public class NearestAverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Limit : ");
        int number = input.nextInt();
        int arr[] = new int[number], sum = 0;
        System.out.println("Enter Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        System.out.println(findNearest(arr, sum / number));
    }


    public static int findNearest(int[] arr, int avg) {
        int diff = ((arr[0] - avg) < 0) ? -(arr[0] - avg) : (arr[0] - avg);
        int nearest = arr[0];
        int i = 1;
        while (i < findLength(arr)) {
            int currentDiff = ((arr[i] - avg) < 0) ? -(arr[i] - avg) : (arr[i] - avg);
            if (currentDiff < diff) {
                diff = currentDiff;
                nearest = arr[i];
            }
            i++;
        }
        return nearest;
    }
    static int findLength(int[] s) {
         int length = 0;
        for (int c : s) ++length;
        return length;
    }
}
