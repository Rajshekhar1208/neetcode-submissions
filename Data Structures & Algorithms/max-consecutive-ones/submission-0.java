class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 1){
                if(temp > answer){
                    answer = temp;
                }
                temp = 0;
            }else if(nums[i] == 1){
                temp++;
            }
        }
        if(temp > answer){
            return temp;
        }
        return answer;
    }
}