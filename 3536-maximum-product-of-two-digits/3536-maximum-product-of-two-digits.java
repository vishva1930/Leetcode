class Solution {
    public int maxProduct(int n) {
        int nn=n;
        int cc=0;
        while(nn!=0){
            nn=nn/10;
            cc++;
        }
        int arr[]=new int[cc];
        int c=0;
        while(n!=0){
            int num=n%10;
            arr[c]=num;
            c++;
            n=n/10;
        }
        Arrays.sort(arr);
        return arr[c-1]*arr[c-2];
        
    }
}