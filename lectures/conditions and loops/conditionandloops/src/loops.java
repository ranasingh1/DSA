import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        /*
        //for loop syntax:

        for(initialisation, condition, increment/decrement){
           //body
        }
         */

        //Print Hello world n times

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = in.nextInt();

//       for (int num = 1; num <= n; num++){
//           System.out.println("Hello World");
//       }
     //While LOOP

        /*
        Syntax :
             while(condition){
             //body
             }

         */
//       int num = 1;
//        while (num<=n) {
//            System.out.println("Hello World");
//             num++;
//        }

        //when to use for and while?
        //use for when number of loops are known  and while when number of loops are
        //not known, print first 10 number(for), print un till user presses x(while)


       //Do while
        //the loop is going to  execute at least on once
        /*
        do{
        //body
        }while(condition)

         */

     int num =1;
        do {
            System.out.println("Hello World");
              num++;
        }while (n!=1 && num<=n );

//even if n=1 it will print once
    }
}
