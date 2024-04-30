package arrayExercises;

public class CopyArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
            arr2[i]=arr1[i];

        System.out.println("Original Array");
        for(int num1:arr1){
            System.out.print(num1);
        }
        System.out.println("Copied Array");
        for(int num2:arr2){
            System.out.println(num2);
        }
        arr2[1] = 0;
        for(int num3:arr1)
            System.out.print(num3);








}}
