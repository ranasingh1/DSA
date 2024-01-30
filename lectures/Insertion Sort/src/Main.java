import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }



    static  void  insertion(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {

                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j-1 );
                }else {
                    break;
                }
            }
        }
    }
    static  void swap(int [] arr, int first, int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
