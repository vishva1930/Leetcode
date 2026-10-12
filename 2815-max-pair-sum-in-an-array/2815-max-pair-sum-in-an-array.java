class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(getMaxDigit(nums[i]) == getMaxDigit(nums[j])){
                    ans = Math.max(ans, nums[i] + nums[j]);
                }
            }
        }   
        return ans;
    }
    private int getMaxDigit(int num){
        int maxDigit = Integer.MIN_VALUE;
        while(num > 0){
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        }
        return maxDigit;
    }
}