class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int one=0;
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch)%2==1)
            one++;
            else
            one--;
        }
        if(one>1)
            return s.length()-one+1;
            return s.length();

    }
}