class Solution {
    public int search(int[] nums, int target) {
        //first finding minimum ele then using it as orignal start index.
        int s = findmin(nums);
       if(nums[s]<=target && nums[nums.length-1]>=target) return searchInfirstHalf(nums,s, nums.length-1,target);
        else return searchInsecHalf(nums,0, s-1,target);
        // else return -1;

    }
     int searchInsecHalf(int[] arr, int s, int e, int target){
        while(s<=e){
            int mid = s+(e-s)/2;
             if(arr[mid] ==target) return mid;
            else if(arr[mid]<target){
                s =mid+1;
            }
            else e=mid-1;
        }
        return -1;
    }
    int searchInfirstHalf(int[] arr, int s, int e, int target){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] ==target) return mid;
           else  if(arr[mid]<target){
                s =mid+1;
            }
            else e=mid-1;
        }
        return -1;
    }

    int findmin(int[] arr){
        if(arr[0]<arr[arr.length-1]) return arr[0];
        int s = 0;
        int e =arr.length;
        int n=arr.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            //arr[(mid+1)%n] && arr[mid]<=arr[(mid+n-1)%n]) 
            // Not taking mid+1 or mid-1 directly because it might generate out of bound error 
            if(arr[mid]<=arr[(mid+1)%n] && arr[mid]<=arr[(mid+n-1)%n]) return  mid;
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