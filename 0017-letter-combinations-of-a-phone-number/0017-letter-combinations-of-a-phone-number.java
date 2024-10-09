class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result =new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        solve(digits,"",0,result,map);
        return result;        
    }
    private void solve(String digit,String out,int index,List<String> result, Map<Character,String> map){
        if(index>=digit.length()){
            result.add(out);
            return;
        }
        String value=map.get(digit.charAt(index));
        for(int i=0;i<value.length();i++){
            out=out+value.charAt(i);
            solve(digit,out,index+1,result,map);
            out=out.substring(0,index);
        }
    }
}