class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        int maxLen =0;
        for(int i=0; i< s.length(); i++){
            int ch  = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);

                }else{
                    int curr = i-st.peek();
                    maxLen = Math.max(maxLen, curr);
                }

            }
            
        } 
        return maxLen;
    }
}