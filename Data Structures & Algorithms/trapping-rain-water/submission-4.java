class Solution {
    public int trap(int[] height) {
        // int i = 0;
        // int j = height.length - 1;
        // int leftMax = height[0];
        // int rightMax = height[j];
        // int area = 0;

        // while(i < j){
        //    if(leftMax < rightMax){
        //         i++;
        //         leftMax = Math.max(leftMax,height[i]);
        //         area = area + leftMax - height[i];
        //    }else{
        //         j--;
        //         rightMax = Math.max(rightMax,height[j]);
        //         area = area + rightMax - height[j];
        //    }

            
        // }
        // return area;


        if(height.length <= 2){
            return 0;
        }

        int area = 0;

        Deque<Integer> arr = new ArrayDeque<>();

        for(int i=0;i<height.length;i++){
            if( arr.size() > 0 && height[i] >= height[arr.peek()]){
                while(arr.size() > 0 && height[i] > height[arr.peek()]){
                int mid = arr.pop();

                if(arr.size() > 0){
                    int h = Math.min(height[i],height[arr.peek()]) - height[mid];
                    int w = i - arr.peek() - 1;
                    area = area + h*w;
                }
                }
            }

                 arr.push(i);
        }
        return area; 
    }
}


