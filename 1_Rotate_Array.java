class Solution {
    public void rotate(int[] nums, int k) {
        // int[]n=new int[nums.length];
        int []num=nums.clone();
        for (int i =0;i<nums.length;i++){
            nums[(i+k)%nums.length]=num[i];
        }
        return;
    }
}