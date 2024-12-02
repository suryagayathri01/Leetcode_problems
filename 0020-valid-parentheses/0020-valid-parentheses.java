class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(') stack.push(c);
            else if(c=='[') stack.push(c);
            else if(c=='{') stack.push(c);
            else if(!stack.isEmpty()){
                if(c==')' && stack.peek()=='(') stack.pop();
                else if(c==']' && stack.peek()=='[') stack.pop();
                else if(c=='}' && stack.peek()=='{') stack.pop();
            }
            else if(c==')' || c==']' || c=='}') return false;
        }
        return !stack.isEmpty() ? false : true;
        
    }
}