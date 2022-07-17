class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]>0 || nums[i]<0){
                ans[j]= nums[i];
                i++;
                j++;
            }
            else {
                i++;
            }
            // else{
            //     ans[j] = nums[i];
            //     i++;
            //     j++;
            // }
        }
       for(int k=0; k<ans.length; k++){
           nums[k] = ans[k];
       }
        return;
    }
}