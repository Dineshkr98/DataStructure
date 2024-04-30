package arrayExercises;

public class RowsandColumn {
    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 7, 2}, {3, 4, 5, 6}};
        int i=0;
        var print = new PrintRowsColumn();
        int Row =print.getrow(mat);
        int Column =print.getColumn(mat,i);
        System.out.println(Row);
        System.out.println(Column);


    }

}



