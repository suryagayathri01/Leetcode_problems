class Solution {
    public boolean canSortArray(int[] nums) {
        List<Integer> curmax=new ArrayList<>();
        List<Integer> curmin=new ArrayList<>();     
        List<List<Integer>> list=new ArrayList<>(); 
        int j=-1;  
        int bin=0;     
        for(int i:nums){
            String s=Integer.toBinaryString(i);
            int one=0;
            for(char c:s.toCharArray()){
                if(c=='1') one++;
            }
            if(one!=bin){
                j++;
                list.add(new ArrayList<>());
                list.get(j).add(i);
                bin=one;
            }
            else list.get(j).add(i);
        }
        for(List<Integer> num:list){
            curmax.add(Collections.max(num));
            curmin.add(Collections.min(num));
        }
        for(int i=0;i<curmax.size()-1;i++){
            if(curmax.get(i)>curmin.get(i+1)) return false;    
        }
        return true;
        
    }
}