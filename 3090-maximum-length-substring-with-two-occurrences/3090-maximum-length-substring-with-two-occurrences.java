// class Solution {
//     public int maximumLengthSubstring(String s) {
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i+1;j<=s.length();j++){
//                 String sub=s.substring(i,j);
//              System.out.println(sub);

//                 char arr[]=sub.toCharArray();
//                 Arrays.sort(arr);
//                 int c=0;
//                 for(int k=0;k<arr.length-1;k++){
//                     System.out.print(arr[k]+"-");
//                     if(arr[k]==arr[k+1]){
//                         c++;
//                     }
//                 }
//                 if(c==1){
//                     max=Math.max(max,sub.length());
//                 }
//                 //System.out.println(max);

//             }
//         }
//         return max;
        
//     }
// }

import java.util.*;

class Solution {
    public int maximumLengthSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                int[] count = new int[256];

                boolean valid = true;

                for (int k = 0; k < sub.length(); k++) {

                    char ch = sub.charAt(k);

                    count[ch]++;

                    if (count[ch] > 2) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    max = Math.max(max, sub.length());
                }
            }
        }

        return max;
    }
}