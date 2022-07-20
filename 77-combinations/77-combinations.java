class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans =new ArrayList<>();
        combi(1,n,k,ans,new ArrayList());
        return ans;
    }
   void combi(int index,int n, int k, List<List<Integer>> ans, List<Integer> list ){
        if(list.size()==k){
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=index; i<=n;i++){
            list.add(i);
            combi(i+1, n,k,ans,list);
            list.remove(list.size()-1);
        }
    }
}