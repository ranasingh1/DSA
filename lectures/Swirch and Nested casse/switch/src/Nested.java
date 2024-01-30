import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();


//        switch (empID) {
//            case 1 :
//                System.out.println("Employee 1");
//                break;
//            case 2 :
//                System.out.println("Employee2");
//                break;
//            case  3 :
//                System.out.println("Employee 3");
//                switch (department){
//                    case "IT" :
//                        System.out.println("IT Department");
//                        break;
//                    case "Management" :
//                        System.out.println("Management");
//                        break;
//                    default:
//                        System.out.println("No Department Entered");
//                }
//                    break;
//            default:
//                System.out.println("Enter a Valid emp ID");
//        }
        switch (empID) {
            case 1 -> System.out.println("Employee 1");
            case 2 -> System.out.println("Employee2");
            case 3 -> {
                System.out.println("Employee 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter a Valid emp ID");
        }
    }
}