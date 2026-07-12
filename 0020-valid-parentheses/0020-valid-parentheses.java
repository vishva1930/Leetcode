class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('){
                stack.push(')');
            }
            else if(x=='['){
                stack.push(']');
            }
            else if(x=='{'){
                stack.push('}');
            }
            else if(x==')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(x==stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(x==']'){

                if(stack.isEmpty()){
                    return false;
                }
                if(x==stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(x=='}'){

                if(stack.isEmpty()){
                    return false;
                }
                if(x==stack.peek()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }


        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;

        
    }
}