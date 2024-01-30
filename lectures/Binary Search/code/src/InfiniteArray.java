//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {4, 7, 9, 13 , 24 , 33, 45 ,66, 69, 71, 87, 90,91,94};
         int target = 87;
        System.out.println(ans(arr, target));
    }
    static  int ans (int arr [], int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int temp = end+1; // new Start
             end =end + (end - start+1)*2;
             start = temp;
        }
        return search(arr, target, start, end);
    }
    static int search(int [] arr, int target, int start, int end){

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
        return  -1;
    }

}
