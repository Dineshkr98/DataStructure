package arrayExercises;

public class PrintRowsColumn{
        private int row;
        private int column;
        public int getrow(int [][] matrix){
            row = matrix.length;
            return row;
        }
        public int getColumn(int [][] matrix,int index){
        column = matrix[index].length;
        return column;
        }

        
        
        
    }
