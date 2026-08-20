class Solution {
    static boolean matches(int[] count1, int [] count2){
        for(int i = 0; i< 26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() ){
            return false;
        }
        int [] count1 = new int[26];
        for(int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            count1[c1 - 'a']++;
        } 
        // first window ready kr lete h
        int i = 0;
        int windowLen = s1.length();
        int [] count2 = new int[26];
        for( i = 0; i<windowLen ; i++){
            char c2 = s2.charAt(i);
            count2[c2 - 'a']++;
        }

        if(matches(count1, count2)){
            return true;
        }
        else{
            // match nhi hue 
            // window ko age badhao aur
            // purane lement ko remove kro

            while(i < s2.length()){
                int newChar = s2.charAt(i);
                count2[newChar - 'a']++;

                int oldCharIndex= i-windowLen;
                int charAtOldIdnex = s2.charAt(oldCharIndex);
                count2[charAtOldIdnex - 'a']--;

                if(matches(count1, count2)){
                    return true;
                }

                i++;

            }
        }
        return false;

    }
}