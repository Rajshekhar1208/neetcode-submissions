class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        if(nums.length == 1){
            return new int[]{nums[0]};
        }

        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    product = product*nums[j];
                }
            }
            output[i] = product;
        }
         return output;
    }
}  
