class Solution {
    public String decodeString(String s) {
      Deque<Integer> countStack = new ArrayDeque<>();  
      Deque<StringBuilder> stringStack = new ArrayDeque<>();
      int number = 0;
      StringBuilder curr =  new StringBuilder();
      for(char ch:s.toCharArray()){
        // case 1
        if(Character.isDigit(ch)){
            number = number*10 +(ch -'0');
        }
        //case 2
        else if(ch == '['){
            countStack.push(number);
            stringStack.push(curr);
            //wapas se initialize krung
            number = 0;
            curr = new StringBuilder();
        }
        //case 3
        else if(ch == ']'){
            int repeataCount =  countStack.peek();
            countStack.pop();
            StringBuilder prev=  stringStack.peek();
            stringStack.pop();

            for(int i=0; i<repeataCount; i++){
                  prev.append(curr);
            }

            curr= prev;

        }
        else{
            curr.append(ch);
        }
      }  
      return curr.toString();
      
    }
}