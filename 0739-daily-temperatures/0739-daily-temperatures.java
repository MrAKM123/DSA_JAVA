class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<Integer> st  = new ArrayDeque<>();
        for(int i =0; i < n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int previous = st.pop();
                res[previous] = i-previous;
            }
            st.push(i);
        }
      
        return res;
    }
}