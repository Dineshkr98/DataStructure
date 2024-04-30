package arrayExercises;

public class BoundaryofElements {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 7, 2}, {3, 4, 5, 6}};
        System.out.println("Original Matrix");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Boundary of Elements");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==0||j==0||i==mat.length-1||j==mat[i].length-1){
                    System.out.print(mat[i][j]);
                }else{
                   // for(int k=3;k<=mat.length;k++)
                    System.out.print(" ");}
            }System.out.println();
        }
    }
}
