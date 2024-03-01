class Solution {
    public int findmax(int[] piles){
        int n=piles.length;
        int max=piles[0];
        for(int i=1;i<n;i++){
            if(piles[i]>max) max=piles[i];
        }
        return max;
    }
    public int tothrs(int[] piles, int h) {
        int n=piles.length;
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=Math.ceil((double)piles[i]/(double)h);
        }
        return tot;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,hgh=findmax(piles);
        while(low<=hgh){
            int mid=(low+hgh)/2;
       int hrs=tothrs(piles,mid);
            if(hrs<=h) hgh=mid-1;
            else low=mid+1;
        }
        return low;
    }
}