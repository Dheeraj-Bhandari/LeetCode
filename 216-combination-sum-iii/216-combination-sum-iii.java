class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(1, ans, k, n, new ArrayList());
        return ans;
    }
    void subset(int index,  List<List<Integer>> ans, int k, int n, List<Integer> list ){
        if(list.size()==k){
           if(isSum(list,n)==true) ans.add(new ArrayList(list));
        }
        for(int i=index; i<=9; i++){
            list.add(i);
            subset(i+1, ans, k, n, list);
            list.remove(list.size()-1);
        }
    }
    boolean isSum(List<Integer> list,int n){
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        if(sum==n) return true;
        else return false;
        
    }

}