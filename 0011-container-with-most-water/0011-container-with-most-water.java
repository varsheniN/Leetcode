class Solution {
    public int maxArea(int[] height) {
       int max=0;
        int ap=0;
        int bp=height.length-1;
        while(ap<bp){
            if(height[ap]<height[bp]){
                max=Math.max(max,height[ap]*(bp-ap));
                ap+=1;
            }
            else{
                max=Math.max(max,height[bp]*(bp-ap));
                bp-=1;
            }
        }
        return max; 
    }
}