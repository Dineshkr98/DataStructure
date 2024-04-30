package LeetCode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 4,4};
        int index = 0;
        int k = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    //System.out.println(nums[i]);
                    count++;
                }
            }
            if(count>k){
                k=count;
                index=nums[i];
            }
            count=0;


        }
        System.out.println(index);
    }
}