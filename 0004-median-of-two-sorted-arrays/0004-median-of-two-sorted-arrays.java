class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i :nums1)
        li.add(i);
        for(int i : nums2)
        li.add(i);
        Collections.sort(li);
        if(li.size()%2!=0)
        return (double)li.get(li.size()/2);
        if(li.size()%2==0)
        return (double)((li.get(li.size()/2)+li.get(li.size()/2-1)))/2;
        return -1;
    }
}