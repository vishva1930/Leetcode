class Solution {
    public int rob(int[] nums) {
        int p1=0;
        int p2=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=Math.max(nums[i]+p2,p1);
            p2=p1;
            p1=c;

        }
        return p1;
   
    }
}