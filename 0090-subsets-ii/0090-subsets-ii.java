class Solution {
    static void solve(int[] nums, List<List<Integer>> ans,List<Integer> output, int index  ){
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int curVal= nums[index];
        output.add(curVal);
        solve(nums, ans, output, index+1);
        output.remove(output.size()-1);
        while(index+1 <nums.length && nums[index] == nums[index+1]){
            index++;
        }
        solve(nums, ans, output, index+1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index  = 0;
        solve(nums, ans, output, index);
         return ans;
    }
}