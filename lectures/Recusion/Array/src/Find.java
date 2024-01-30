import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
         int [] arr = {1,4 ,5, 19, 19};
         int target = 19;
//        System.out.println(found(arr, target, 0));
//        System.out.println(found1(arr, target, 0));
//        System.out.println(found2(arr, target, arr.length-1));
//        findAll(arr, target, 0);
//        System.out.println(list);
//        ArrayList<Integer> ans = findAll2(arr, target, 0, new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findAll3(arr, target, 0));
    }
    static boolean found (int [] arr, int target, int index){
         if(index== arr.length){
             return false;
         }
         return  arr[index]==target || found(arr, target, index+1);
    }
    static int found1 (int [] arr, int target, int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==target) {
            return index;

        }else {
            return found1(arr, target, index+1);
        }

    }
    static int found2 (int [] arr, int target, int index){
        if(index== -1){
            return -1;
        }
        if(arr[index]==target) {
            return index;

        }else {
            return found1(arr, target, index-1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll (int [] arr, int target, int index){
    if(index==arr.length){
        return;
    }
       if(arr[index]==target){
           list.add(index);
       }
            findAll(arr, target, index+1);
    }

    static ArrayList findAll2 (int [] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
         return findAll2(arr, target, index+1, list);
    }
    static ArrayList findAll3 (int [] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
     //this will contain the answer for that function call only   ok
        if(arr[index]==target){
            list.add(index);
        }
        //add answer from last call to this
        ArrayList<Integer>  ansFromBelowCalls = findAll3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }




}
