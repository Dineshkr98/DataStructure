package arrayExercises;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        // Create two new arrays to store the rotated segments
        int[] firstSegment = new int[d];
        int[] secondSegment = new int[arr.length - d];

        // Store the first segment (from index 0 to d-1) in firstSegment
        for (int i = 0; i < d; i++) {
            firstSegment[i] = arr[i];
        }

        // Store the second segment (from index d to arr.length-1) in secondSegment
        for (int i = d; i < arr.length; i++) {
            secondSegment[i - d] = arr[i];
        }

        // Combine both segments into a single array
        int[] combinedArray = new int[arr.length];
        System.arraycopy(secondSegment, 0, combinedArray, 0, secondSegment.length);
        System.arraycopy(firstSegment, 0, combinedArray, secondSegment.length, firstSegment.length);

        // Print the combined array
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }
}

