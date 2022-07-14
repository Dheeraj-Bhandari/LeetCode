class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
          List<Character> str1 = new ArrayList<Character>();
        List<Character> str2 = new ArrayList<Character>();
        int count =0;
        int c = 0;
        for(int i=0; i<s1.length(); i++){
            if(count>2) return false;
            char ch = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch!=ch2){
               str1.add(ch);
                str2.add(ch2);
                count++;
            }
            
        }
        if(count>2) return false;
        System.out.println(str1.containsAll(str2));
        if(str1.containsAll(str2)) return true;
        return false;
    }
}