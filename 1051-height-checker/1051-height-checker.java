class Solution {
    public int heightChecker(int[] heights) {
        int c =0;
        int []arr =heights.clone();
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                c++;
            }
        }return c;
        
    }
}