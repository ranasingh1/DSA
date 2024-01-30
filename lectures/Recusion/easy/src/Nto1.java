// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        nto1(n);
    }
    // concept
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }

    //prints 5,4,3,2,1
    static void nto1(int n){
        //base
        if(n==0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }
//print 1,2,3,4,5
//static void nto1(int n){
//    //base
//    if(n==0){
//        return;
//    }
//    nto1(n-1);
//    System.out.println(n);
//
//}
}