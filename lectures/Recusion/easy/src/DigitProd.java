public class DigitProd {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(prodDigit(n));
    }

    static int prodDigit(int n){
        if(n%10==n){
            return n;
        }
        return prodDigit(n/10)*n%10;
    }
}
