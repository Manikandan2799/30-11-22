// For a given array of size N, reverse every sub-array formed by
// consecutive K element.
//  Note : Don't use extra space.
//  Examples :
//  Input : N = 9
//  arr = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
//  k = 3
//  Output : arr = [ 3, 2, 1, 6, 5, 4, 9, 8, 7 ]

//  Input : N = 8
//  arr = [ 1, 2, 3, 4, 5, 6, 7, 8 ]
//  k = 5
//  Output : arr = [ 5, 4, 3, 2, 1, 8, 7 ]

//  Input : N = 8
//  arr = [ 1, 2, 3, 4, 5, 6, 7, 8 ]
//  k = 10
//  Output : arr = [ 8, 7, 6, 5, 4, 3, 2, 1 ] 
   
   import java.util.Scanner;
    public class ReverseSubArray {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            int number =input.nextInt();
            int[] arr =new int[number];
            for(int i = 0; i< number; i++)
                arr[i] = input.nextInt();
            int cons=input.nextInt();
            for(int i = 0; i< number; i+=cons)
            {
                int leftIndex =i;
                int check =i + cons - 1;
                int rightIndex =(check < number -1)? check : number -1;
                while (leftIndex < rightIndex) {
                    int temp = arr[leftIndex];
                    arr[leftIndex] = arr[rightIndex];
                    arr[rightIndex] = temp;
                    leftIndex++;
                    rightIndex--;
                }
                for(int a: arr) {
                    System.out.println(a);
                }

            }
        }
    }

