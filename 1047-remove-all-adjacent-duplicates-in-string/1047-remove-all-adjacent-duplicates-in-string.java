class Solution {
    public String removeDuplicates(String s) {
        // string builder ready krenge 
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            //string pr current char pre hu
            char ch = s.charAt(i);
            // right most char har curr char ke equal h to esse egnore kr do
            // aur curr cha ko bhi string se delete kr do
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ch) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                //agr equal nhi h to append kr do
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}