public class DigitsSum {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(sumDigit(n));
    }

    static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        return sumDigit(n/10)+n%10;
    }
}
