import java.util.*;

public class TrappedWater {  //TIme complexity O(n)
    public static int trappedRainWater(int height[]){
        //calculate left max boundary - array
        //calculate right max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length -2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        //loop
        int totalTrappedRainWater = 0;
        for(int i = 0 ; i<height.length;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            totalTrappedRainWater+=waterlevel - height[i];
        }
        //waterlevel = min(leftmaxboundary, rightmaxboundary)
        //trapped water = waterlevel - height[i]
        return totalTrappedRainWater;  
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5}; 
        System.out.println(trappedRainWater(height));
    }
}
