package arrayExercises;

public class SearchanElementinarray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int key = 7;
        boolean result=false;

        for(int i=0;i<arr.length;i++)
            result = arr[i] == key;
        System.out.println(result);
        }

    }

