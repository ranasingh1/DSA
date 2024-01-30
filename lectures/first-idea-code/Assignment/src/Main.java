import java.util.Scanner;



public class Main {

/*
    //odd-even program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println( num +" is a even number ");
        }else {
            System.out.println(num + " is a odd number");
        }
        }
*/
/*
   //Greeting
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Hello" +name);
    }
*/
/*
//To calculate Fibonacci Series up to n numbers.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number :");
    int num = input.nextInt();
    int first = 0;
    int second = 1;
   for(int i=0;i<num; i++ ){
       System.out.println("Fibonacci series is:" +first);
       int temp = first + second;
       first = second;
       second= temp;
   }
   }
*/
 /*
//To find out whether the given String is Palindrome or not.
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = input.nextInt();
    int originalNum = num;
    int reverseNumber = 0;
   while (num>0){
       int lastNumber = num%10;
        reverseNumber = reverseNumber*10+lastNumber;
        num/=10;
   }
if(reverseNumber == originalNum){
    System.out.println("palindrome");
}else {
    System.out.println("not palindrome");
}


}
*/
public static void main(String[] args) {
    int num1,num2;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first numbers:");

     num1= input.nextInt();
    System.out.println("Enter second numbers:");

    num2 = input.nextInt();

    int check1 = num1, rem1, sum1 = 0;
    while (check1 != 0) {
        rem1 = check1 % 10;
        sum1 = sum1 + (rem1 * rem1 * rem1);
        check1 /= 10;
    }

    if (sum1 == num1) {
        System.out.println(num1 + " is an Armstrong number.");
    } else {
        System.out.println(num1 + " is not an Armstrong number.");
    }

    // Check second number
    int check2 = num2, rem2, sum2 = 0;
    while (check2 != 0) {
        rem2 = check2 % 10;
        sum2 = sum2 + (rem2 * rem2 * rem2);
        check2 /= 10;
    }

    if (sum2 == num2) {
        System.out.println(num2 + " is an Armstrong number.");
    } else {
        System.out.println(num2 + " is not an Armstrong number.");
    }
}
}