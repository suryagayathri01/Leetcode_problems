import java.util.regex.*;
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        String regex=("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()+-])(?=.\\S+$).{8,}$");
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        if(!matcher.matches()) return false;
        for(int i=0;i<password.length()-1;i++){
            if(password.charAt(i)==password.charAt(i+1)) return false;
        }
        return true;
        
    }
}