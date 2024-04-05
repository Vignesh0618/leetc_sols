class Solution {
    public String makeGood(String s) {
        int ep=0;
        char[] ca=s.toCharArray();
        for(int cp=0;cp<s.length();cp++){
            if(ep>0 && Math.abs(ca[cp]-ca[ep-1])==32){
            ep--;
            }
        else{
          ca[ep]=ca[cp];
          ep++;
        }
        }
        return new String(ca).substring(0,ep);
    }
}