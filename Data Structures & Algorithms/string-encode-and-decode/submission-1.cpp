class Solution {
public:
    
    string s = "";
    string encode(vector<string>& strs) {
       
       for(string str : strs){
        s.push_back('\n');
        s.append(str);
       }
       s = s+'\n';
       return s;
    }
     
    vector<string> decode(string s) {
        
        string str;
        vector<string> str1;
        for(int i =0;i<s.size();i++){
            while(s[i]!='\n'){
                str.push_back(s[i]);
                i++;
            }
            if(s[i] == '\n'){
                str1.push_back(str);
                str = "";
            }
            

        }
        str1.erase(str1.begin());
        return str1;

    }
};
