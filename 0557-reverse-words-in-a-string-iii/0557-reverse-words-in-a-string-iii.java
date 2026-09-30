class Solution {
    public static void reverse(char [] arr, int s, int e){
        while(s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
    }
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        int n= arr.length;
        int i  = 0;
        for(int j = 0; j <= n; j++){
            if(j == n || arr[j] ==' '){
                reverse(arr, i ,j-1 );
                i = j+1;
            }
        }
        return new String(arr);
    }
}