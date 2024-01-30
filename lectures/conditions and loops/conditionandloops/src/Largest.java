import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

//         if(num1>num2&&num1>num3){
//             System.out.println("The largest Number is " +num1);
//         } else if (num2>num1&&num2>num3) {
//             System.out.println("The largest Number is " +num2);
//
//         }else {
//             System.out.println("The largest Number is " +num3);
//
//         }

        int max= num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        System.out.println("largest number: " +max);


    }
}
