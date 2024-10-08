class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        Map<Character,String> mapping = new HashMap<>();
        mapping.put('2',"abc");
        mapping.put('3',"def");
        mapping.put('4',"ghi");
        mapping.put('5',"jkl");
        mapping.put('6',"mno");
        mapping.put('7',"pqrs");
        mapping.put('8',"tuv");
        mapping.put('9',"wxyz");


        solve(digits,"",0,ans,mapping);
        return ans;        
    }

    private void solve(String digit,String output,int index,List<String> ans, Map<Character,String> mapping){
        if(index>=digit.length()){
            ans.add(output);
            return;
        }
        String value=mapping.get(digit.charAt(index));
        for(int i=0;i<value.length();i++){
            output=output+value.charAt(i);
            solve(digit,output,index+1,ans,mapping);
            output=output.substring(0,index);

        }


    }
}