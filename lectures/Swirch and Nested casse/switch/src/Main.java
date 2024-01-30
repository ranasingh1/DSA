import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

/*
        switch(fruit)

        {
            case "Mango":
                System.out.println("King of fruits");
                break;

            case  "Apple":
                System.out.println("Round Fruit");
                break;
            case  "Orange" :
                System.out.println("A citrus fruit");
                break;
            default:
                System.out.println("Enter a valid Fruit");
        } //Enhance switch statement
*/
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Round Fruit");
//            case "Orange" -> System.out.println("A citrus fruit");
//            default -> System.out.println("Enter a valid Fruit");
//        }
        int day = in.nextInt();

/*
     switch (day) {
         case 1 -> System.out.println("Monday");
         case 2 -> System.out.println("Tuesday");
         case 3 -> System.out.println("Wednesday");
         case 4 -> System.out.println("Thursday");
         case 5 -> System.out.println("Friday");
         case 6 -> System.out.println("Saturday");
         case 7 -> System.out.println("Sunday");
         default -> System.out.println("Enter valid Day");
}
*/
/*
Benefit of not putting break
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Enter valid Day");
                break;
        }
*/

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("Enter valid Day");
        }
    }
}