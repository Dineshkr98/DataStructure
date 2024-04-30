package LeetCode;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println();
        return k;
    }
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int value = 3;
        int index=0;
        RemoveElement sol = new RemoveElement();
        int count= sol.removeElement(nums,value);
        System.out.println(count);
        int[] res = new int[count];
        for(int i=0;i<count;i++){
            if(nums[i]!=value){
                res[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i< res.length;i++){
            nums[i]=res[i];
        }
        for(int i=0;i< res.length;i++)
            System.out.print(nums[i]);

    }
}
