public class Fibonacci {
    //identifying recursion solution
       //break it down into smaller problems
      //fib(n) = fib(n-1)+fib(n-2)//also called recurrence relation
     //the base condition is represented by answer we already have
    //in this case we know that f(0) = 0 and f(1) = 1 //base condition

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
     static  int  fibo(int n){
        //base condition
         if(n<2){
             return n;
         }
         
        return fibo(n-1)+fibo(n-2);
     }
}
