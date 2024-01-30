// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sorted {
    public static void main(String[] args) {
        int [] arr = {2,4,7,29, 14};
        System.out.println(sorted(arr,0 ));
    }
    static boolean sorted(int [] arr, int index){
        if(index == arr.length-1){
            return  true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }

}