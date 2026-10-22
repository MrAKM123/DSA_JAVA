class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch: num.toCharArray()){
            while(!st.isEmpty() && k>0 &&st.peek()> ch){
                st.pop();
                k--;


            }
            st.push(ch);
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());

        }
        result.reverse();
        int index = 0;

        while(index < result.length() && result.charAt(index) == '0' ){
            index++;
        }
        String ans = result.substring(index);
    
       if(ans.length() == 0){
        return "0";

       }else{
        return ans;
       }

    }
}