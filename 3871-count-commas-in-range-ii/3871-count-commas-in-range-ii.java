class Solution {
    public long countCommas(long n) {
        if(n<1000){ 
        return 0;
        }
        long num=0;
        if (n>999) {
            num=num+n-999;
        }
        if(n>999999){
            num=num+n-999999;
        }
        if(n>999999999){
            num=num+n-999999999;
        }
        if(n>999999999999L){
            num=num+n-999999999999L;
        }
        if(n>999999999999999L){
            num=num+n-999999999999999L;
        }
        return num;
    }
}