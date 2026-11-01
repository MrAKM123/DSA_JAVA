class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();

        for(int ast: asteroids){
            if(ast >= 0){
                st.push(ast);
            }else{
                //ast <0
                if(st.isEmpty()){
                    st.push(ast);
                }
                else if(st.isEmpty() && st.peek()<0){
                    st.push(ast);
                }
                else{
                    // 1st +ve
                    //2nd -ve
                    boolean destroyed = false;
                    while(!st.isEmpty() && ast <0 && st.peek() >0){
                        if(st.peek()> -ast){
                            destroyed = true;
                            
                            break;
                        }
                        else if(st.peek()< -ast){
                            st.pop();
                            continue;
                        }
                        else{
                            // st,peek() == -ast
                            st.pop();
                            destroyed =true;
                            break;
                        }

                    }
                    if(destroyed == false){
                        st.push(ast);
                    }
                }
            }
        }
        int ans[] = new int [st.size()];
        for(int i = st.size()-1 ; i >=0; i-- ){
             ans[i] = st.pop();
        }
        return  ans;
    }
}