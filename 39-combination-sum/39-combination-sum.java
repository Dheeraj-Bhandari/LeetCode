class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
      List<List<Integer>> ans =new ArrayList<>();
        combi(0,cand,target,ans,new ArrayList());
        return ans;
    }
   void combi(int index,int[] cand, int k, List<List<Integer>> ans, List<Integer> list ){
        if(k==0){
            ans.add(new ArrayList(list));
            // return;
        }
       if(k<0){
           return;
       }
        for(int i=index; i<cand.length;i++){
            list.add(cand[i]);
            combi(i,cand,k-cand[i],ans,list);
            list.remove(list.size()-1);
        }
    }
}