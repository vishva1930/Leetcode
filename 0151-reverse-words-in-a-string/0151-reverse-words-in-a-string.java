// class Solution {
//     public String reverseWords(String s) {
//         char []arr=s.toCharArray();
//         String str="";
//         ArrayList<String> list=new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=' '){
//                 str=str+arr[i];
//             }
//             else{
//                 list.add(str);
//                 str="";
//             }
//         }
//          if (!str.equals("")) {
//             list.add(str);
//             str="";
//         }
//         String w="";
//        for(int i=list.size()-1;i>=0;i--){
//         if(i==0){
//             w=w+list.get(i);
//         }
//         else{
//             w=w+list.get(i)+" ";
//         }
//        }
//         return w;
        
//     }
// }

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        String str = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                str += arr[i];
            } else {
                if (str.length() > 0) {
                    list.add(str);
                    str = "";
                }
            }
        }

        if (str.length() > 0) {
            list.add(str);
        }

        String w = "";

        for (int i = list.size() - 1; i >= 0; i--) {
            w += list.get(i);
            if (i != 0) {
                w += " ";
            }
        }

        return w;
    }
}