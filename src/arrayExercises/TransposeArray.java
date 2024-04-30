package arrayExercises;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1,1}, {2, 2, 2,2}, {3, 3, 3,3}};
        int[][] arr1= new int[arr[0].length][arr.length];

        for (int i = 0; i <arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {

                arr1[i][j] = arr[j][i];
            }
        }

                System.out.println("New Array");
                for (int i = 0; i < arr[0].length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr1[i][j]);
                    }
                    System.out.println();
            }

        }
    }



