class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        max=max-k;
        min=min+k;
        if((max-min)<0){
            return 0;
        }
        return max-min;       
    }
}