import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        System.out.println("Convert Cel. into Far.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temperature  in Cel:");
        float tempInCel = in.nextFloat();
        float temInFar = (tempInCel*9/5) + 32;
        System.out.println("Tem in Far:" +temInFar);
    }
}
