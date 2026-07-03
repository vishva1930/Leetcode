class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int i=0;
        int max=0;
        if(nums.length==0){
            return 0;
        }
        while(i<nums.length-1){
            if((nums[i+1]-nums[i])==1){
                c++;
            }
            else if(nums[i+1]==nums[i]){
                i++;
                continue;
            }
            else{
                max=Math.max(max,c);
                c=1;
            }
            i++;
        }
        return Math.max(max,c);
        
    }
}