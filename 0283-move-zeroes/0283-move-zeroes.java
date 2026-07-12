class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int l=nums.length-1;
        int []num=nums.clone();
        for(int i =0;i<=nums.length-1;i++){
            if (num[i]==0){
               nums[l]=0;
               l--; 
            }else{
                nums[count]=num[i];
                count++;
            }
        }return ;
    }
}