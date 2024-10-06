class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] sen1=sentence1.split(" ");
        String[] sen2=sentence2.split(" ");
        
        int start=0, end1=sen1.length-1, end2=sen2.length-1;

        if(sen2.length > sen1.length){
            return areSentencesSimilar(sentence2,sentence1);
        }
        
        while(start<sen2.length && sen1[start].equals(sen2[start])){
            start++;
        }
        while(end2>=0 && sen1[end1].equals(sen2[end2])){
            end1--;
            end2--;
        }
        if(start>end2){
            return true;
        }
        

        

        /*if(sen1[0].equals(sen2[0]) && sen1[sen1.length-1].equals(sen2[sen2.length-1]) ){
            return true;
        }
        
        if(sen1[0].equals(sen2[0])){
            if(sen2.length>1){
                for(int i=1;i<sen2.length;i++){
                    if(!sen2[i].equals(sen1[sen1.length-1])){
                        return true;
                    }
                }
            }
            return true;
        }
        if(sen1[sen1.length-1].equals(sen2.length-1)){
            for(int i=0;i<sen2.length-1;i++){
                if(!sen2[i].equals(sen1[0])){
                    return true;
                }
            }
        }*/
        

        
        return false;
        
    }
}