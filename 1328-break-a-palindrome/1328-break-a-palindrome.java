class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        char arr[]=palindrome.toCharArray();
        int c=0;
        for(int i=0;i<palindrome.length()/2;i++){
           if(arr[i]!='a'){
            arr[i]='a';
            c++;
            break;
           } 
        }
        if(c==0){
            arr[arr.length-1]='b';
        }
        String s="";
        String r="";
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            r=r+arr[i];
        }
        if(s!=r){
            return s;
        }
        else{
            return "";
        }  
}
}
