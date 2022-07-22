class Solution {
    public int findMin(int[] nums) {
       int ans =  findroration(nums);
        return ans;
    }
    int findroration(int[] arr){
        if(arr[0]<arr[arr.length-1]) return arr[0];
        int s = 0;
        int e =arr.length;
        int n=arr.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<=arr[(mid+1)%n] && arr[mid]<=arr[(mid+n-1)%n]) return  arr[mid];
            if(arr[s]<=arr[mid]){
                s = mid;
            }
            else{
                e = mid;
            }
        }
     return -1;   
    }
    
}