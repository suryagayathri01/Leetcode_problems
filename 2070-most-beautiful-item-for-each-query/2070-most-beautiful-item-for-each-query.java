class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] ans=new int[queries.length];
        Arrays.sort(items,(a,b)->a[0]-b[0]);
        int[][] queryIndex=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            queryIndex[i][0]=queries[i];
            queryIndex[i][1]=i;
        }
        Arrays.sort(queryIndex,(a,b)->a[0]-b[0]);
        int index=0,maxvalue=0;
        for(int i=0;i<queries.length;i++){
            int orgIndex=queryIndex[i][1];
            int orgValue=queryIndex[i][0];
            while(index<items.length && items[index][0]<=orgValue){
                maxvalue=Math.max(maxvalue,items[index][1]);
                index++;
            }
            ans[orgIndex]=maxvalue;
        }

        return ans;
    }
}