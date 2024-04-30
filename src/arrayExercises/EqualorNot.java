package arrayExercises;

public class EqualorNot {
    public static void main(String [] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7,4,5};
        boolean value = true;
        if(arr1.length==arr2.length){
        for(int i =0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i])
                value = false;

        }
    }else
          value = false;
 if(value==true)
    System.out.println("Arrays are equal");
    else
    System.out.println("Arrays are not equal");

}
}
