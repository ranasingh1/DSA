import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Second Number");
        int num2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Third Number");
        int num3 = input3.nextInt();
        printMax(num1, num2, num3);
        printMin(num1,num2,num3);
    }
    public static  void printMax(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("largest is:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("largest is:" + num2);

        } else {
            System.out.println("largest is:" + num3);
        }


    }
        public static  void printMin(int num1, int num2, int num3) {
            int min = num1;
            if (num2< min) {
                min =num2;
            }
            if (num3 <min) {

                min=num3;

            }
            System.out.println("smallest is:" +min);



        }


}
