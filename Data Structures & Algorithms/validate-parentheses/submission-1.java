class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> set = new ArrayDeque<>();

        for(Character ch : s.toCharArray()){
            
            if(ch == '(' || ch == '[' || ch == '{'){
                set.push(ch);
            }

            if(ch == ')' || ch == '}' || ch == ']'){

                if(set.size() == 0){
                    return false;
                }
                Character a = set.pop();
                if((a == '(' && ch != ')') || (a == '[' && ch != ']') || (a == '{' && ch != '}')){
                    return false;
                }

            }
        }

        if(set.size() != 0){
            return false;
        }

        return true;
    }
}
