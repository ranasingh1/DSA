public class Main {
    public static void main(String[] args) {

     int[] nums = {23,45, 1,2, 5 , 4, 9, 89 , -11, 66, 455 ,19};
     int target = 123;
     int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //search in the array: return the index if item found
    //otherwise item not found return -1

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return  -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
           int element = arr[index];
           if(element==target){
               return  index;
           }
        }
        //this line will execute if none of return statement above have executed
        //hence no target found
        return -1;
    }
}