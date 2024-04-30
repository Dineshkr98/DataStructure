package arrayExercises;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result ={1,2};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   result[0]=i;
                   result[1]=j;
                }
            }
        }return result;


    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution sol = new Solution();
       int[] res = sol.twoSum(nums,target);
       for(int n:res){
           System.out.print(n);
       }

    }
}
