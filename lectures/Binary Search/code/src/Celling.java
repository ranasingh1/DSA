public class Celling {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4 , 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 55;
        System.out.println(celling(arr, target));
    }
    static int celling(int [] arr, int target){

        if(target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
//             int mid = (start+ end)/2; // might be possible that (start +end) exceeds the range of int
            int mid = start + (end-start)/2;//2s+ e-s/2
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                //answer found
                return  mid;
            }
        }
        return  start;
    }
}
