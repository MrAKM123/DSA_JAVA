class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int addition = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                //ch = ')'
                if(st.isEmpty()){
                    addition++;
                }
                else{
                    // not empty
                    st.pop();
                }
            }

        }
        // upper to hm sirf closing ko trck kr rhe h addition ke through
        // ((( ye ho to isme 3 closing bracket add krna hoga uske liye stack ke size ko track krlenge 
         int result = addition + st.size();
         return result;
    }
}