import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        /*
          function/Method syntax
          access_modifier return_type function_name (parameters){

             //body
             return statement
          }


         */
        //Examples
        // A function inside static class is always static
//        sum();
//       int paramfunc=  sum2(5,60);
//        System.out.println(paramfunc);
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = sum2(num1, num2);
        System.out.println(result);
    }
//        static void sum() {
//            Scanner in = new Scanner(System.in);
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int result =a+b;
//            System.out.println(result);
//        }
// return type int with parameters, a void doesn't return but int etc. do
   static  int sum2 (int a , int b){
        int sum = a+b;
        return  sum;
   }



}