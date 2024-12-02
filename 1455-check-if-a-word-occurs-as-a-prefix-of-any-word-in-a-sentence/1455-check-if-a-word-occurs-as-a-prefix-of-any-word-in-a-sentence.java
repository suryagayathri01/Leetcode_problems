class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str=sentence.split(" ");
        List<String> li=Arrays.asList(str);
        for(int i=0;i<li.size();i++){
            if(li.get(i).startsWith(searchWord)) return i+1;
        }
        return -1;
        
    }
}