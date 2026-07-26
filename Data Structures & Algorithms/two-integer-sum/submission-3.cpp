class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       
       vector<pair<int,int>> sum;
       vector<int> sum2;
       for(int i =0 ;i<nums.size();i++)
       {
        sum.push_back({nums[i],i});
       }      

    

       sort(sum.begin(),sum.end());

       int left = 0,right = nums.size()-1;

       while(right >= left){
      
       int a = sum[left].first;
       int b = sum[right].first;

       if(a + b == target){
        return {min(sum[left].second,sum[right].second),max(sum[left].second,sum[right].second)};
       }
       else if(a + b > target){
        right--;
       }
       else
       {
        left++;
       }


       }


        
    }
};
