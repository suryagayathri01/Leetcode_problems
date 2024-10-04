class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length % 2 !=0){
            return -1;
        }
        int n=skill.length;
        
        Arrays.sort(skill);

        List<int[]> pairs=new ArrayList<>();
        int k=0;
        long sum=0;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            pairs.add(new int[]{skill[i],skill[j]});
            if(skill[i]+skill[j]!=skill[0]+skill[n-1]){
                k=1;
            }
            if(k==1){
                return -1;
            }
            sum+=skill[i]*skill[j];
        }
        return sum;

        
    }
}