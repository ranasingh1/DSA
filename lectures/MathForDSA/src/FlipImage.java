public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        // Create an instance of the FlipImage class
        FlipImage flipImage = new FlipImage();

        // Call the flipAndInvertImage method to modify the image
        int[][] modifiedImage = flipImage.flipAndInvertImage(image);

        // Print the modified image
        for (int[] row : modifiedImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
