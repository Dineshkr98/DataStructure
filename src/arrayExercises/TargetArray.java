package arrayExercises;

public class TargetArray {
    public static void main(String[] args){
        int [] arr = {-1,11,9,1,7,3,10,0,12,-2};
        int target = 10;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The sum numbers are: "+ arr[i]+" "+arr[j]);
                }
            }
        }
    }

}

