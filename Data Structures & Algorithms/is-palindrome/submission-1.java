class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                sb.append(Character.toLowerCase(ch));
            }
        }
        char[] str = sb.toString().toCharArray();
        int i = 0;
        int j = str.length - 1;
        while(i<j){
            if(str[i] == str[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }

        return true;
    }
}


