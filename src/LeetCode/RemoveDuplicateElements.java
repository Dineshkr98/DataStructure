package LeetCode;

public class RemoveDuplicateElements {
    public static void main(String[] args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int k =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                System.out.print(nums[i]);
                k++;
            }
        }
        System.out.println();
        nums[k++]=nums[nums.length-1];
        for(int i=0;i<k;i++)
            System.out.print(nums[i]);
        //System.out.println(k);


    }
}
