import java.util.Scanner;

public class sun {
    public static void main(String[] args) {
        System.out.println("Sum of two Numbers");
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter Number 1:");
        double num1 = input.nextDouble();
        System.out.print("Enter Number 2:");
        double num2 = input.nextDouble();

        double result = num1 + num2;

        System.out.println("Sum:" +result);
    }
}
