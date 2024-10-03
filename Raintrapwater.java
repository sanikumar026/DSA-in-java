public class Raintrapwater {
    public static int TrapRainWater(int heightarray[]) {
        //lest most
        int n= heightarray.length;
        //for left max
        int leftmax[]= new int[n];
        leftmax[0]= heightarray[0];
        for(int i=1;i<n;i++) {
             leftmax[i]= Math.max(heightarray[i],leftmax[i-1]);
        }

        // calcilate rightmax
        int RightMax[]= new int[n];
        RightMax[n-1]=heightarray[n-1]; 
        for(int j= n-2;j>=0;j--) {
            RightMax[j]=Math.max(heightarray[j], RightMax[j+1]);

        }
        //for min 
        
        int trappedwater= 0;
        for(int k=0;k<n;k++) {
         int waterlevel= Math.min(leftmax[k], RightMax[k]);
          trappedwater+=waterlevel-heightarray[k];
         
          }

        
return  trappedwater;
        
    }
    public static void main(String[] args) {
        
        int heightarray[]= {4,2,0,6,3,2,5};
        System.out.print(TrapRainWater(heightarray));
    
    
    }
}
