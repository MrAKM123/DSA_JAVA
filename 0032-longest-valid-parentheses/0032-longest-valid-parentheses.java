class Solution {
    public int longestValidParentheses(String s) {
        int open =0;
        int close = 0;
        int maxLen = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else {
                close++;
                
            }
            if(close > open){
                // invalid
                open = 0;
                close = 0;
            }else if(open == close){
                maxLen = Math.max(maxLen , 2*close);
            }
        }
        open =0;
        close = 0;
        for(int i = s.length()-1; i>=0 ; i--){
            char ch =s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                close++;

            }
            if(open> close){
                // invalid
                open = 0;
                close = 0;
            }
            else if(open == close){
                maxLen = Math.max(maxLen , 2*open);
            }
        }
        return maxLen;
        // Deque<Integer> st = new ArrayDeque<>();
        // st.push(-1);
        // int maxLen =0;
        // for(int i=0; i< s.length(); i++){
        //     int ch  = s.charAt(i);
        //     if(ch == '('){
        //         st.push(i);
        //     }
        //     else{
        //         st.pop();
        //         if(st.isEmpty()){
        //             st.push(i);

        //         }else{
        //             int curr = i-st.peek();
        //             maxLen = Math.max(maxLen, curr);
        //         }

        //     }
            
        // } 
        // return maxLen;
    }
}