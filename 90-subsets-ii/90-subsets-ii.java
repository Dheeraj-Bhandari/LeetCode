class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,nums, ans, new ArrayList());
        return ans;
    }
   void subset(int index, int[] nums, List<List<Integer>> ans , List<Integer> list ){
        ans.add(new ArrayList(list));
        for(int i=index; i<nums.length; i++){
            if(i>index && nums[i-1]==nums[i])continue;
            list.add(nums[i]);
            subset(i+1,nums, ans, list);
            list.remove(list.size()-1);
        }
    }
}