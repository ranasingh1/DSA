import java.util.ArrayList;
import java.util.List;

class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 2, 1};
        List<Integer> duplicate = findDuplicates(arr);
        System.out.println(duplicate);
    }
    static List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {

                    if (!result.contains(nums[i])) {
                        result.add(nums[i]);
                    }
                    i++;
                }
            } else {
                i++;
            }
        }

        return result;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}