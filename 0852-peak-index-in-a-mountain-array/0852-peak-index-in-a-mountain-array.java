class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr[0]>arr[1]){
            return 0;
        }
        int s=1;
        int l =arr.length-2;
        while(s<=l){
           int mid=s+(l-s)/2;
          if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
            s=mid+1;}
        else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid]){
            l=mid-1;
        }
        else if(arr[mid-1]<arr[mid] &&  arr[mid+1]<arr[mid]){
            return mid;
        }


        }return 0;
    }
}