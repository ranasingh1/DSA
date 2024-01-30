// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //recursion is function calling itself
    public static void main(String[] args) {
             print(1);
               }
        static void print(int n){
        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }
            System.out.println(n);
            //this is called tail recursion
            //this is the last function call
            print(n+1);
        }
//WHY RECURSION?
    //It helps us in solving bigger/complex problems in a simple way.
    //you can convert recursion solution into iteration and vice-versa.
    //space complexity is not constant because of recursive calls.
    //it helps in breaking down bigger problems into smaller problems

}