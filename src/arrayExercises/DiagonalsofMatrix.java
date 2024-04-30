package arrayExercises;

public class DiagonalsofMatrix {
    public static void main(String[] args){
        int[][] mat = {{6, 7, 3, 4},{8, 9, 2, 1},{1, 2, 9, 6},{6, 5, 7, 2}};
        int result = 0;
        int result1 = 0;
        for(int i =0;i< mat.length;i++)
            for(int j=0;j< mat.length;j++){
               if(i==j)
                result+= mat[i][j];
               if((i+j)==(mat.length-1)){
                   result1+= mat[i][j];
               }



        }
        System.out.println(result);
        System.out.println(result1);
    }
}
