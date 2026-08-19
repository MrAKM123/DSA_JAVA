class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            // end me spaces ko ignore krne ke liye
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            //invalid case
            if (i < 0) {
                break;
            }
            // j jab tak char mil rhe h
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
             // ans me append krna kyuki string  h to string builder me 
             //change kr
             //ke append krna hoga j+1 se i tk
            ans.append(s.substring(j + 1, i + 1));
              // faltu ke spaces beech wale
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;

            }
            // ans me ek space add krna kyuki hr word ke badd wala
            if (j >= 0) {
                ans.append(' ');
            }
            //i ko j pr lao hir se 
            i = j;
        }
        return ans.toString();
    }
}