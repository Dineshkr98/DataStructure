package arrayExercises;

public class TwoDArrayTarget {
    public static void main(String[] args){
        int[][] arr = {{10, 12, 13, 14, 15},{11,12,16,12,13},{23,34,12,18,19}};
        int target =20;
        boolean result = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             if (arr[i][j]==target){
                 result=true;
                 break;
             }
                }
            }
        System.out.println(result);
        }
    }

