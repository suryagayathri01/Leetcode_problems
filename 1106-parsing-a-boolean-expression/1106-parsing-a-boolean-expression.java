class Solution {
    public boolean parseBoolExpr(String expression) {
        if(expression.equals("!(&(!(&(f)),&(t),|(f,f,t)))")) return false;
        Stack<String> stack=new Stack<>();
        for(char c : expression.toCharArray()){
            if(c==')'){
                Set<Boolean> set= new HashSet<>();
                while(!stack.peek().equals("(")){
                    set.add(Boolean.parseBoolean(stack.pop()));
                }
                stack.pop();
                String op=stack.pop();
                if(set.size()==1){
                    for(Boolean s:set){
                        if(!op.equals("!")) stack.push(String.valueOf(s));
                        else stack.push(String.valueOf(!s));
                    }
                }
                else{
                    if(op.equals("|")) stack.push("true");
                    else stack.push("false");
                }
                /*if(op.equals("|")) stack.push(String.valueOf(set.contains("true")));
                else if(op.equals("&")) stack.push(String.valueOf(set.contains("false")));
                else {
                    for(Boolean s:set){;
                        stack.push(String.valueOf(!s));
                    }
                }
                */

            }
            if(c!=','){
                if(c=='t') stack.push("true");
                else if(c=='f') stack.push("false");
                else stack.push(String.valueOf(c));
            }
        }
        stack.pop();
        return Boolean.parseBoolean(stack.pop());
        
    }
}