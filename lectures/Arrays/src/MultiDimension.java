import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         /*
            1 2 3
            4 5 6
            7 8 9
          */
        int[][] arr = new int[3][3]; // it is not necessary to declare the number of columns
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
        //using for loop
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//
        //using arrays toString
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //using enhanced for loop
        for(int [] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
    }

