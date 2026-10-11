class Solution {
    public int minSwaps(String s) {
        if (s.length() % 2 != 0) {

         return -1;
      }

      int open = 0;
      int close = 0;
      for(char ch : s.toCharArray()){
        if(ch == ']' && open>0){
            open--;
        }
        else{
            if(ch == '['){
                open++;
            }
            else if( ch == ']'){
                close++;
            }
        }
      }
      
    //   Deque<Character> st = new ArrayDeque<>();
    //   for (char ch : s.toCharArray()) {
    //      if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
    //         st.pop();
    //      } else {
    //         st.push(ch);
    //      }

    //   }
    //   int open = 0;
    //   int close = 0;
    //   while (!st.isEmpty()) {
    //      if (st.peek() == '[') {
    //         open++;
    //      } else {
    //         close++;
    //      }
    //      st.pop();
    //   }
      int res = (open + 1) / 2 + (close + 1) / 2;
      return res/2;
 
    }
}