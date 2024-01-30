import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //syntax
//        ArrayList<DataType(wrappers)> list_name = new ArrayList<DataType>();
         ArrayList<Integer> list = new ArrayList<>();

//         list.add(67);
//         list.add(77);
//         list.add(7);
//         list.add(87);
//         list.add(677);
//
//         list.set(0,99);
//         list.remove(2);
//        System.out.println(list);

        //input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
        }
    }
}
