class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int value=(1 << maximumBit)-1;
        int[] xor=new int[nums.length];
        int j=nums.length-1;
        int flag=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            xor[j]=nums[i] ^ flag;
            arr[j]=value ^ xor[j];
            flag=xor[j];
            j--;
        }
        return arr;
        
    }
}