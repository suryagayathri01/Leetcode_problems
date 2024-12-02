class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int i:arr) list.add(i);
        int zero=0;
        for(int i:list){
            if(i==0) zero++;
            if(list.contains(i*2)){
                if(zero!=2 && i==0) continue;
                else return true;
            }
        }
        return false;
        
    }
}