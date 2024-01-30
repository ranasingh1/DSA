import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter first number");
        int num2 = input2.nextInt();
            primeNumber(num1, num2);
    }

    public static  void primeNumber(int num1, int num2){
        int prime = 0;
        for (int i = num1; i <= num2 ; i++) {
            if(i==1||i==0){
                continue;
            }
              int flag =1;
            for(int j=2; j<=i/2;j++){
                if(i%j==0){
                    flag =0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }

    }
}
