class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
     List<List<Integer>> ans =new ArrayList<>();
        combi(0,cand,target,ans,new ArrayList());
        return ans;
    }
   void combi(int index,int[] cand, int k, List<List<Integer>> ans, List<Integer> list ){
        if(k==0){
               ans.add(new ArrayList(list)); 
     
        }
      if(k<0) return;
        for(int i=index; i<cand.length;i++){
            if(i>index && cand[i]==cand[i-1]) continue;
            list.add(cand[i]);
            combi(i+1,cand,k-cand[i],ans,list);
            list.remove(list.size()-1);
        }
    }
}