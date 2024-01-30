public class SingleElemntFind {

     static int findSingleElement(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                // Count the number of set bits at position i for all elements
                sum += (num >> i) & 1;
            }

            // If the total count is not a multiple of 3, set the bit in the result
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5};
        int singleElement = findSingleElement(nums);
        System.out.println("The single element is: " + singleElement);
    }
}

