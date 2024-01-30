import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //array of primitives
        int [] arr = new  int[5];
        arr[0]= 23;
        arr[1]= 45;
        arr[2]= 230;
        arr[3]= 445;
        arr[4]= 33;


//       //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //or forEach loop
//        for(int num :arr){//for every element in array print the element
//            System.out.println(num +" "); //here num represents element of the array
//        }
        //using to String
//        System.out.println(Arrays.toString(arr));

        //Array of objects
        String [] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
