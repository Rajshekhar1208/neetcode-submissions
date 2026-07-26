class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> set;

        for(int num : nums){
            set[num]++;
        }

        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> minHeap;

        for(auto& num : set){
            minHeap.push({num.second,num.first});
            if(minHeap.size() > k){
                minHeap.pop();
            }
        }

        vector<int> kmost;
        while(!minHeap.empty()){
          kmost.push_back(minHeap.top().second);
          minHeap.pop();
        }

        return kmost;
    }
};
