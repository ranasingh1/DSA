// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //store five roll no
        int roll1 =1;
        int roll2 =2;
        int roll3 =3;
        int roll4 =4;
        int roll5 =5;

        //or Arrays
        //syntax
        // dataType [] variable_name = new dataType[size];
//        int [] ros = new int[5];
//        //or directly
//        int[] ros2 ={1,2,3,4,5 };

        int[] ros;//declaration of array, ros is getting defined in stack
        ros = new int[5];//initialisation: here object is being created in the memory(heap)
        System.out.println(ros[1]);//output - 0 , for an integer array everything is going to be zero by default
        String [] arr = new String[4];
        System.out.println(arr[0]);//output null,null means it does not have datatype,it is a special literal type
//        String str = null; // this will not give error because we can assign it to non primitive types
//        int num= null;//this will give error, because primitive type

    }
}