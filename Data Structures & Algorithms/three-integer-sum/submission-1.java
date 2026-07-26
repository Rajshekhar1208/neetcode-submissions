class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> answer = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int k = i+1;
            int j = nums.length-1;

            if((i>0) && nums[i] == nums[i-1]){
                continue;
            }

            while(k<j){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[k]);
                    temp.add(nums[j]);
                    answer.add(temp);
                    k++;
                    j--;
                }
                else if(sum > 0){
                    j--;
                }else {
                    k++;
                }
                while((k<j)&& k > i+1 && (nums[k] == nums[k-1])){
                    k++;
                }
                while((k<j) && j < nums.length-1 && (nums[j] == nums[j+1])){
                    j--;
                }
               
            }
            
        }

        return answer;
    }
}


