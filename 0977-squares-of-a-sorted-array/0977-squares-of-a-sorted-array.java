class Solution {
    public int[] sortedSquares(int[] nums) {
      int [] res = new int[nums.length];
        int i = 0;
        int j = nums.length -1;
        int k = res.length -1;
        while(i<=j){
            int sqrtI = nums[i]*nums[i];
            int sqrtJ = nums[j]*nums[j];
           
          if(sqrtI > sqrtJ){
            res[k]= sqrtI;
            i++;
          }else{
            res[k] =sqrtJ;
            j--;
          }
          k--;

        }  
         return res;
    }
}