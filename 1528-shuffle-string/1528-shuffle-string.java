class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        String ans="";
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            ans=ans+arr[i];
        }
        return ans;
        
    }
}