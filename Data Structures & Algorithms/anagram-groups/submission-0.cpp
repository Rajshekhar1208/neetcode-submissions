class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {

        

        vector<vector<string>> sum;
        unordered_map<string,vector<string>> map1;
        for(const string& str : strs ){
            string str1 = str;
            sort(str1.begin(),str1.end());
            map1[str1].push_back(str);
        }

        for(auto& str : map1){
         
           sum.push_back(str.second);
             
        }

        return sum;
        
    }
};
