class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        else if(s.equals(goal)) return true;
        String str=s+s;
        return str.contains(goal);
        
    }
}