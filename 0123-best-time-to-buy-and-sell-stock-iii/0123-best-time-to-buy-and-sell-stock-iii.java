class Solution {
    public int maxProfit(int[] prices) {
        int b1 = Integer.MIN_VALUE;
        int s1 = 0;
        int b2 = Integer.MIN_VALUE;
        int s2 = 0;

        for(int i : prices){
            b1 = Math.max(b1,-i);
            s1 = Math.max(s1,b1+i);
            b2 = Math.max(b2,s1-i);
            s2 = Math.max(s2,b2+i);
        }

        return s2;
    }
}

        
 
