class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double sum = Integer.MIN_VALUE;
        for(int i =0;i<=nums.length-k;i++){
            int a=0;
            int b=i;
            int s=0;
            while(a<k) {
                s+=nums[b];
                b++;
                a++;
            }
            double avg = (double)s / k;
            if(avg>sum){
                sum=avg;
            }

        }return sum;
        
    }
}