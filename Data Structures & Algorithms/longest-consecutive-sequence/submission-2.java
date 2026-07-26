class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }

        int a = 0;
        int temp = 1;

        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i]-1)){
                arr.add(nums[i]);
            }
        }

        for(Integer i : arr){
            int t = i;
            while(map.contains(t+1)){
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
