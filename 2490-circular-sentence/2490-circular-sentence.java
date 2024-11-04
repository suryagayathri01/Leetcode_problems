class Solution {
    public boolean isCircularSentence(String sentence) {
        List<String> list=Arrays.asList(sentence.split(" "));
        int len=list.size();
        /*if(len==1){
            if(list.get(0).charAt(0) != list.get(0).charAt(list.get(0).length()-1)) return true;
            else return false;
        }*/
        if(list.get(0).charAt(0) != list.get(len-1).charAt(list.get(len-1).length()-1)) return false;
        for(int i=0;i<len-1;i++){
            if(list.get(i).charAt(list.get(i).length()-1) != list.get(i+1).charAt(0)) return false;
        }
        return true;
        
        
        //System.out.println(list.get(0).charAt(list.get(0).length()-1));
        //return false;

        
    }
}