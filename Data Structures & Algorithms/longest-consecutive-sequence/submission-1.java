class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }

        int a = 0;
        int temp = 1;

        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(nums[i]-1)){
                arr.add(nums[i]);
            }
        }

        for(Integer i : arr){
            int t = i;
            while(map.containsValue(t+1)){
                temp++;
                t++;
            }
            if(temp > a){
                a = temp;
            }
            temp = 1;
        }
        return a;
    }

    
}
