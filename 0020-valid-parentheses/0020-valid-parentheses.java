class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch =='(' || ch == '[' || ch== '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(ch == ')' && st.peek() != '('){
                    return false;
                  
                }
                else if(ch == ']' && st.peek()!= '['){
                    return false;
                }
                else if(ch == '}' && st.peek() != '{'){
                    return false;
                }  
                else{
                    st.pop();
                } 
            }
        }
        if(st.isEmpty()){
            return true;

        }else{
            return false;
        }
    }


}