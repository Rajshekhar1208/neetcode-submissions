class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length-1;

        int area = Integer.MIN_VALUE;

        while(i < j){
            int area_temp = ((heights[i] > heights[j] ? heights[j] : heights[i]) * (j-i));
            
            if(area_temp > area){
                area = area_temp;
            }

            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }

        }

        return area; 
    }
}
