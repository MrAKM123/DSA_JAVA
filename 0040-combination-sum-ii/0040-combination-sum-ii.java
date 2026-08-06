class Solution {
    static void solve(int[] candidates, int target, List<List<Integer>> ans,List<Integer> output, int index ){
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if( index >= candidates.length){
            return;
        }
        if(target < 0){
            return;
        }
        int curVal = candidates[index];
        output.add(curVal);
        solve( candidates, target-curVal, ans, output, index+1);
        output.remove(output.size()-1);
        while(index+1 <candidates.length && candidates[index] == candidates[index+1]){
            index++;
        }
        solve(candidates, target, ans, output, index+1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(candidates);
        int index = 0;
        solve(candidates, target, ans, output, index);
        return ans;
    }
}