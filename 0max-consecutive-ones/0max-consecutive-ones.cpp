class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int c=0;
        int max1=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                c++;
            }
                else if(nums[i]==0){
                    max1=max(max1,c);
                    c=0;
                }
                max1=max(max1,c);
        }
        return max1;
    }
};