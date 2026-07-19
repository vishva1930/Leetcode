class Solution {
     static int countDigits(int num) {
        if (num == 0)
            return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Find 10^n
    static int power(int n) {
        int p = 1;
        while (n > 0) {
            p *= 10;
            n--;
        }
        return p;
    }


    public String largestNumber(int[] nums) {
        String str="";
         int n = nums.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                int d1 = countDigits(nums[j]);
                int d2 = countDigits(nums[j + 1]);

                long first = (long) nums[j] * power(d2) + nums[j + 1];
                long second = (long) nums[j + 1] * power(d1) + nums[j];

                if (first < second) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
   
       

        // Print the largest number
        for (int i = 0; i < n; i++) {
            //System.out.print(nums[i]);
            str=str+nums[i];
        }
        if(str.charAt(0)=='0'){
            return "0";
        }
        return str;
    }
}