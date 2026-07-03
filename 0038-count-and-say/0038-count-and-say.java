class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            StringBuilder ans =new StringBuilder();
            int count=1;
            for(int j=0;j<s.length();j++){
                if(j < s.length() - 1 && s.charAt(j)==s.charAt(j+1)){
                    count++;
                }
                else{
                    ans.append(count);
                    ans.append(s.charAt(j));
                    count=1;
                }
            }
            s=ans.toString();
        }
        return s;
        
    }
}