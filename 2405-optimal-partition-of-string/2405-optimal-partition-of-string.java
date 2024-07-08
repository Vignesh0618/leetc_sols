class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int partition = 0;
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                partition++;
                set.clear();
            }
            set.add(c);
        }
        return partition+1;
    }
}