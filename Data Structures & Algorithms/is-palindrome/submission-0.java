class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str = sb.toString();
        String str_rev = sb.reverse().toString();
        if(str.equals(str_rev)){
            return true;
        }

        return false;
    }
}


