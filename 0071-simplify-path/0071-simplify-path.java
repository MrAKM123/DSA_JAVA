class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String[] parts = path.split("/");
        for(String part:parts){
            if(part.isEmpty()){
                //ignore
                continue;

            }
            if(part.equals(".")){
                //ingnore
                continue;
            }
            if(part.equals("..")&& st.isEmpty()){
            //ingnore
            continue;

            }
            if(part.equals("..") && !st.isEmpty()){
                st.pop();
            }
            else{
                  st.push(part);
            }
        }
        if(st.isEmpty()){
            return "/";
        }else{
            StringBuilder ans = new StringBuilder();
            while(!st.isEmpty()){
                ans.append("/");
                ans.append(st.removeLast());

            }
            return ans.toString();
        }

    }
}