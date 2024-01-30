public class Swap {
    public static void main(String[] args) {
// this won't work because in java primitive data types are
        //pass by value, inside the function it's changing but not actually modifying
        //the original value
        //        int n1= 10;

//        int b1= 20;
//
//        swap(n1, b1);


//static  void swap (int a, int b){
//    int temp = a;
//    a=b;
//    b= temp;
// }

    // in java not primitive are passed by value of reference variable, so it
    // can modify the original vlaue

        int[] numbers = { 5, 10 };

        System.out.println("Before swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
        swapNumbers(numbers);
        System.out.println("After swapping: num1 = " + numbers[0] + ", num2 = " + numbers[1]);
    }


    public static void swapNumbers(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
