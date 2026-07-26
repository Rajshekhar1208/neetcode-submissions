class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        if(nums.length == 1){
            return new int[]{nums[0]};
        }

        // for(int i=0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i != j){
        //             product = product*nums[j];
        //         }
        //     }
        //     output[i] = product;
        // }
        //  return output;
        
        int product = 1;

        int[] pre = new int[nums.length];
        int[] pos = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            pre[i] = product;
            product = product*nums[i];
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            pos[i] = product;
            product = product * nums[i]; 
        }
        for(int i=0;i<nums.length;i++){
            output[i] = pre[i] * pos[i];
        }

        return output;
    }
}  
